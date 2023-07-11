SUMMARY = "Python library for reading and writing image, video, and related formats"
DESCRIPTION = "Imageio is a Python library that provides an interface to read and \
write a wide range of image data, including animated images, volumetric \
data, and scientific formats."
LICENSE = "BSD-2-Clause"

PV = "2.31.1"

RPM_NAME = "python311-imageio-2.31.1-1.1.noarch.rpm"
RPM_HASH = "a217f7e48e5a15fe099719e64845c47e6ff63de1798f436882216b049a1c6a41e0bdc2c8c8de61a9eb4f3f0c73687c53c8aacd928ea7ed2bec1275f5f0be1107"
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
