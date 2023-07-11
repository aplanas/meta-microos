SUMMARY = "Python library for reading and writing image, video, and related formats"
DESCRIPTION = "Imageio is a Python library that provides an interface to read and \
write a wide range of image data, including animated images, volumetric \
data, and scientific formats."
LICENSE = "BSD-2-Clause"

PV = "2.31.1"

RPM_NAME = "python39-imageio-2.31.1-1.1.noarch.rpm"
RPM_HASH = "94644ecf16fcd9471d40992b3b026174e0053a184e134499850a516cf5faf76975379eb96e4f5e4520276b5ce7325dd118b8d239963801b7fe6ab9ee30959e10"
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
