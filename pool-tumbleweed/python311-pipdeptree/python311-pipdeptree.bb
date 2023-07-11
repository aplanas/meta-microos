SUMMARY = "Command line utility to show dependency tree of packages"
DESCRIPTION = "Command line utility to show dependency tree of packages."
LICENSE = "MIT"

PV = "2.7.1"

RPM_NAME = "python311-pipdeptree-2.7.1-1.3.noarch.rpm"
RPM_HASH = "5d26fb97f460d165a8f5d98f760933504d5c604fe51b12a632f73bbc4b9b8e04b273a5953bcd0a7b92563ea8f00f432e59fe3f6d4e22fbab70644d7bedacd70c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pipdeptree \
python3.11dist-pipdeptree \
python311-pipdeptree \
python3dist-pipdeptree"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-pip \
update-alternatives"

inherit rpm
