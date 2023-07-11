SUMMARY = "Image reading library"
DESCRIPTION = "Mahotas-imread is a simple module with a small number of functions: \
 \
imread \
    Reads an image file \
imread_multi \
    Reads an image file with multiple images. Currently, TIFF and STK (a TIFF \
    sub-based format) support this function. \
imsave \
    Writes an image file"
LICENSE = "MIT"

PV = "0.7.4"

RPM_NAME = "python310-imread-0.7.4-3.13.aarch64.rpm"
RPM_HASH = "80b6f381097ecb1cf908c1941d457dfb66c2de30642e24dd9537b4067b2e6e849bdceeb1c63bacea1a079c405e7d5c00694e217b805967cbe1e75a52e7cf1f6f"

RPROVIDES:${PN} += "python3.10dist-imread \
python310-imread \
python3dist-imread"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
python-abi \
python310-numpy"

inherit rpm
