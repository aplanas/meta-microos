SUMMARY = "Manage Python errors with ease"
DESCRIPTION = "A Python library that makes exceptions handling and inspection easier"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python311-crashtest-0.4.1-2.1.noarch.rpm"
RPM_HASH = "caa1fce81ed8ce5b7153a9514011236bba11f9636edb38062050e658d1352df9ebca6ffdb2827cda04fc02783653ef06b5454678bcec11b5564a62b3336f088c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-crashtest \
python311-crashtest \
python3dist-crashtest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
