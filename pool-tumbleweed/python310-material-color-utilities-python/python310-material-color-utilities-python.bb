SUMMARY = "Python port of material-color-utilities used for Material You colors"
DESCRIPTION = "Python port of material-color-utilities used for Material You colors."
LICENSE = "Apache-2.0"

PV = "0.1.5"

RPM_NAME = "python310-material-color-utilities-python-0.1.5-1.5.noarch.rpm"
RPM_HASH = "59276ed51575db9b6c641af6efbc999ea4b8af1a36585d7a62b1c8033fcbf2011623cd59aae5c7de54daa2c8913b0afaa6522fb48d2c15af6fdcbc6e284334f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-material-color-utilities-python \
python310-material-color-utilities-python \
python3dist-material-color-utilities-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm
