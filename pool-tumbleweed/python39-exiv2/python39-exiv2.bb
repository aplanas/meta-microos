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

RPM_NAME = "python39-exiv2-0.11.0-1.7.aarch64.rpm"
RPM_HASH = "d5b5219e2f9a3795df1cd7c7bda05daea4241a09317c07a4740ead7a51ca6c494936baff9081391bea4c89ee8b22ad38895c53d24acacb2f2e0f4cda860af754"

RPROVIDES:${PN} += "libexiv2python.cpython-39-aarch64-linux-gnu.so()(64bit) \
python3.9dist(py3exiv2) \
python39-exiv2 \
python39-exiv2(aarch-64) \
python3dist(py3exiv2)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libboost_python-py3.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libexiv2.so.27()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
