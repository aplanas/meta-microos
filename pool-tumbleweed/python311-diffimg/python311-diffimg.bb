SUMMARY = "Library to compute the percent difference between images"
DESCRIPTION = "A library to get the percent difference in images and generate a diff image."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-diffimg-0.3.0-1.9.noarch.rpm"
RPM_HASH = "209d8646f07b8520553af2aa9e1359ec7aabd099bd171e2669bfb79aa085b9372be707a6d5f5954c1aa243b4db358d61e55b5c279a860879acda0f1d741c1b58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-diffimg \
python3.11dist-diffimg \
python311-diffimg \
python3dist-diffimg"

RDEPENDS:${PN} += "python-abi \
python311-Pillow"

inherit rpm
