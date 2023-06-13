SUMMARY = "HAProxy control tool"
DESCRIPTION = "This is a utility to control HAProxy features through its admin \
socket. haproxyctl has the ability to disable/enable servers, fetch \
info from the running instance and list available servers, together \
with their status."
LICENSE = "GPL-3.0-only"

PV = "0.5"

RPM_NAME = "python310-haproxyctl-0.5-3.4.noarch.rpm"
RPM_HASH = "6ab6bd6ed71e5171a8e5a911ff6dd16ca004ba8c8c586aeadc647e952930ec2a8f31daf36a1e0a6436ae9e8b939c4a47f0eab6608c83382ca10fb01c7e1c63c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-haproxyctl \
python3.10dist(haproxyctl) \
python310-haproxyctl \
python3dist(haproxyctl)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
haproxy \
python(abi)"

inherit rpm
