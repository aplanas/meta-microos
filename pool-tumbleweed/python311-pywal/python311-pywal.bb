SUMMARY = "Generate and change color-schemes on the fly"
DESCRIPTION = "Generate and change color-schemes on the fly"
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python311-pywal-3.3.0-1.14.noarch.rpm"
RPM_HASH = "4d29d34c45077721ced0f6c9b55b42435c7941f30706ed047d6913f8fd3ec07b735fd3d59fbfcc6bced41ee8ce09f59e84cfc3a7d57c6e95a4b4889f5aa7b79f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pywal \
python3.11dist-pywal \
python311-pywal \
python3dist-pywal"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi"

inherit rpm
