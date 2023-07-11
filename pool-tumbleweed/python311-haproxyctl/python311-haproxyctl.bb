SUMMARY = "HAProxy control tool"
DESCRIPTION = "This is a utility to control HAProxy features through its admin \
socket. haproxyctl has the ability to disable/enable servers, fetch \
info from the running instance and list available servers, together \
with their status."
LICENSE = "GPL-3.0-only"

PV = "0.5"

RPM_NAME = "python311-haproxyctl-0.5-3.5.noarch.rpm"
RPM_HASH = "53892e486032839b7882094888f480d2f5eeed2d34eb561d80f33e0bffda87f44f4df42b2243003f2cace318af2fb8bb0269f4c615650eebc87cfe6211a658e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-haproxyctl \
python3.11dist-haproxyctl \
python311-haproxyctl \
python3dist-haproxyctl"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
haproxy \
python-abi"

inherit rpm
