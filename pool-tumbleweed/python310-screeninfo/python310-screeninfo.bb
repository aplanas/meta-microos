SUMMARY = "Fetch location and size of physical screens"
DESCRIPTION = "Python module to fetch location and size of physical screens."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python310-screeninfo-0.8.1-1.5.noarch.rpm"
RPM_HASH = "75646f04d9329c86e88816f59a6425bd0d2603675fa0c891c9eda1cce03cb36da9f44f79690fceb5e526001b67a84d5c5d3013efe9995c5e9e78079e63533b5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-screeninfo \
python310-screeninfo \
python3dist-screeninfo"

RDEPENDS:${PN} += "python-abi"

inherit rpm
