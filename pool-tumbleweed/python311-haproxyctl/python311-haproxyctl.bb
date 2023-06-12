SUMMARY = "HAProxy control tool"
DESCRIPTION = "This is a utility to control HAProxy features through its admin \
socket. haproxyctl has the ability to disable/enable servers, fetch \
info from the running instance and list available servers, together \
with their status."
LICENSE = "GPL-3.0-only"

PV = "0.5"

RPM_NAME = "python311-haproxyctl-0.5-3.4.noarch.rpm"
RPM_HASH = "1274d479f6b825f1e5f1916aa14a1f2d65c5aecf9fa60cede4a48a845182755c3bf4178b2869cbf90e958de1e4a160bc13a588f002137a13a19607dbdd2c9de1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(haproxyctl) \
python311-haproxyctl \
python3dist(haproxyctl)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
haproxy \
python(abi)"

inherit rpm
