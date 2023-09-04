SUMMARY = "Python library for reading and writing image, video, and related formats"
DESCRIPTION = "Imageio is a Python library that provides an interface to read and \
write a wide range of image data, including animated images, volumetric \
data, and scientific formats."
LICENSE = "BSD-2-Clause"

PV = "2.31.1"

RPM_NAME = "python311-imageio-2.31.1-2.1.noarch.rpm"
RPM_HASH = "34e07d172718ee4a9c0238620f332d8bdedc9b8b16fb512b96c7cec697a23905b61a24edfe44cd51a6724bb89d874eed47db66fbc8c324877f7785c51fd7c01c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-imageio \
python3.11dist-imageio \
python311-imageio \
python3dist-imageio"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Pillow \
python311-numpy \
update-alternatives"

inherit rpm
