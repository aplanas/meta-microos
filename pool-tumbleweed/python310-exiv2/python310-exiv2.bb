SUMMARY = "Python3 bindings for the exiv2 library"
DESCRIPTION = "python3-exiv2 is a Python 3 binding to exiv2, the C++ library for manipulation \
of EXIF, IPTC and XMP image metadata. It is a python 3 module that allows your \
scripts to read and write metadata (EXIF, IPTC, XMP, thumbnails) embedded in \
image files (JPEG, TIFF, ...). \
 \
It is designed as a high-level interface to the functionalities offered by \
libexiv2. Using python’s built-in data types and standard modules, it provides \
easy manipulation of image metadata."
LICENSE = "GPL-3.0-only"

PV = "0.12.3"

RPM_NAME = "python310-exiv2-0.12.3-1.1.aarch64.rpm"
RPM_HASH = "df94dc272a35cac70893417f31e93f2f10d95aecfb0aa45df9f11d5bfdcff38fe2759f31230e3061a2096c5d7a4c755109f10bd2cbadb57b9b592b6bd9c03abd"

RPROVIDES:${PN} += "libexiv2python.cpython-310-aarch64-linux-gnu.so \
python3.10dist-py3exiv2 \
python310-exiv2 \
python3dist-py3exiv2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-python-py3.so.1.82.0 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
