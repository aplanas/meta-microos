SUMMARY = "Python library for reading and writing image, video, and related formats"
DESCRIPTION = "Imageio is a Python library that provides an interface to read and \
write a wide range of image data, including animated images, volumetric \
data, and scientific formats."
LICENSE = "BSD-2-Clause"

PV = "2.31.1"

RPM_NAME = "python310-imageio-2.31.1-2.1.noarch.rpm"
RPM_HASH = "034e76f7b6f777cb0f16dabdf0d2f394a8b897c09a6975161cfa969a2a7dd05a63eca32ca2b3beb577e7906ffee31cd2635bb7c1dc7363b0e84933d7c0352c4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-imageio \
python310-imageio \
python3dist-imageio"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Pillow \
python310-numpy \
update-alternatives"

inherit rpm
