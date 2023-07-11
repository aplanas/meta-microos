SUMMARY = "HAProxy control tool"
DESCRIPTION = "This is a utility to control HAProxy features through its admin \
socket. haproxyctl has the ability to disable/enable servers, fetch \
info from the running instance and list available servers, together \
with their status."
LICENSE = "GPL-3.0-only"

PV = "0.5"

RPM_NAME = "python39-haproxyctl-0.5-3.5.noarch.rpm"
RPM_HASH = "9e9bd3a9876dae901e4ed53fdc5e01d1dab5073fe8a7a51b45d5cc2aeb9e3c0cba98979e1db2933f3e52c6b2a529cf44381bddf6b86380bd95c7b914cdfc7caa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-haproxyctl \
python39-haproxyctl \
python3dist-haproxyctl"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
haproxy \
python-abi"

inherit rpm
