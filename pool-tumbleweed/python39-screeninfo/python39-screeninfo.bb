SUMMARY = "Fetch location and size of physical screens"
DESCRIPTION = "Python module to fetch location and size of physical screens."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python39-screeninfo-0.8.1-1.5.noarch.rpm"
RPM_HASH = "6182e781e64067ed364c7643f0e11d9900ab3ee459845564d0c1a1d9234db5aa0a0019af94ad595bec5e7723bc673b04e2cdc6939374a6c922c985dda50e776c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-screeninfo \
python39-screeninfo \
python3dist-screeninfo"

RDEPENDS:${PN} += "python-abi"

inherit rpm
