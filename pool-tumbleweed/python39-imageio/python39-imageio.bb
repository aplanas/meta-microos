SUMMARY = "Python library for reading and writing image, video, and related formats"
DESCRIPTION = "Imageio is a Python library that provides an interface to read and \
write a wide range of image data, including animated images, volumetric \
data, and scientific formats."
LICENSE = "BSD-2-Clause"

PV = "2.31.1"

RPM_NAME = "python39-imageio-2.31.1-2.1.noarch.rpm"
RPM_HASH = "9a9b0b2b21c5753e80d4b698fbd1c5aeed338aa9e6eac795dc16385f76048b8ef1a67fd704a5ce97b7af6adcf83f8eec4c1ab390d73f02d19a5d232ee7593103"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-imageio \
python39-imageio \
python3dist-imageio"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Pillow \
python39-numpy \
update-alternatives"

inherit rpm
