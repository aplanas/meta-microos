SUMMARY = "Python library for reading and writing image, video, and related formats"
DESCRIPTION = "Imageio is a Python library that provides an interface to read and \
write a wide range of image data, including animated images, volumetric \
data, and scientific formats."
LICENSE = "BSD-2-Clause"

PV = "2.31.1"

RPM_NAME = "python310-imageio-2.31.1-1.1.noarch.rpm"
RPM_HASH = "e45c1328ed0bf37b61bb1a471503db48b33bbab87c67683de7adb79666679c2d17219cc98936f1897d2ba644a0cd6773e517e6b727a860be724fa1c96d9e288f"
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
