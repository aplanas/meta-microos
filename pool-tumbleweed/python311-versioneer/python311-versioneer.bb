SUMMARY = "VCS-based management of project version strings"
DESCRIPTION = "Versioneer is a tool to automatically update version strings (in \
setup.py and the conventional ‘from PROJECT import _version’ pattern) \
by asking the version control system about the current tree."
LICENSE = "Unlicense"

PV = "0.28"

RPM_NAME = "python311-versioneer-0.28-1.3.noarch.rpm"
RPM_HASH = "aa6604c9acc0c0f8f6dad9c564b43cb591bd46c2a02d84613c23ec77f5da0c8a508a32f71298e1b9fbab907aa44583aff343e1b4830d655ac11028fbfa07d545"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-versioneer \
python3.11dist-versioneer \
python311-versioneer \
python3dist-versioneer"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
