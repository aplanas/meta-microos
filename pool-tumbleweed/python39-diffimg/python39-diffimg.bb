SUMMARY = "Library to compute the percent difference between images"
DESCRIPTION = "A library to get the percent difference in images and generate a diff image."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-diffimg-0.3.0-1.9.noarch.rpm"
RPM_HASH = "5db1f3097ad4fc9901685361c66a71fe2c903498feeda29a7339c27e14a99dc98560257c4e0738b94f7b68ee8793ccc18d5ddb54d1b4e22a693c2ec836a3ab26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-diffimg \
python39-diffimg \
python3dist-diffimg"

RDEPENDS:${PN} += "python-abi \
python39-Pillow"

inherit rpm
