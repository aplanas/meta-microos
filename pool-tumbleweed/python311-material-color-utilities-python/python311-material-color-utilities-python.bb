SUMMARY = "Python port of material-color-utilities used for Material You colors"
DESCRIPTION = "Python port of material-color-utilities used for Material You colors."
LICENSE = "Apache-2.0"

PV = "0.1.5"

RPM_NAME = "python311-material-color-utilities-python-0.1.5-1.4.noarch.rpm"
RPM_HASH = "116f1c870842714695d8a99853eed9073fe6384376f3c71694021ecee347f9a06f067f0ac3142347e4b67f9e7f9249088e3323eabc4b0ed723b25bc309405bdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-material-color-utilities-python \
python311-material-color-utilities-python \
python3dist-material-color-utilities-python"

RDEPENDS:${PN} += "python-abi"

inherit rpm
