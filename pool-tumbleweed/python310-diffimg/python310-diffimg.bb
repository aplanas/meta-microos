SUMMARY = "Library to compute the percent difference between images"
DESCRIPTION = "A library to get the percent difference in images and generate a diff image."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-diffimg-0.3.0-1.9.noarch.rpm"
RPM_HASH = "376ff38cc938563ad846022afe1678d3e5f7e31ae9cb3c444169c185f58dd729b176f38e8299d8cee0e45ec061ab2173895f016ffe4bb7e508ac2ebf58ad3927"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-diffimg \
python310-diffimg \
python3dist-diffimg"

RDEPENDS:${PN} += "python-abi \
python310-Pillow"

inherit rpm
