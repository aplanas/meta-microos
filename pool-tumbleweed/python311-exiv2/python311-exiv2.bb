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

PV = "0.11.0"

RPM_NAME = "python311-exiv2-0.11.0-1.9.aarch64.rpm"
RPM_HASH = "ee34bf919f9bd040fe13ef6af1daa5c0dfe814ada2a03a48ac4ce97f6e3583787c6ff04978e929f21cececb94e5e10c4d20f184ebcea43b989a8d366bfacb967"

RPROVIDES:${PN} += "libexiv2python.cpython-311-aarch64-linux-gnu.so \
python3-exiv2 \
python3.11dist-py3exiv2 \
python311-exiv2 \
python3dist-py3exiv2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-python-py3.so.1.82.0 \
libc.so.6 \
libexiv2.so.27 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
