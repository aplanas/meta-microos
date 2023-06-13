SUMMARY = "Python port of material-color-utilities used for Material You colors"
DESCRIPTION = "Python port of material-color-utilities used for Material You colors."
LICENSE = "Apache-2.0"

PV = "0.1.5"

RPM_NAME = "python310-material-color-utilities-python-0.1.5-1.4.noarch.rpm"
RPM_HASH = "3c85e9498e6ea3124750de7f9a1599b6f9d5acf640e5e4aacbb67f6e82c7c226a45d9000185b7dad2781fdde814af374aa88eee07e3d0344fc2cee3a825f3f76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-material-color-utilities-python \
python3.10dist(material-color-utilities-python) \
python310-material-color-utilities-python \
python3dist(material-color-utilities-python)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
