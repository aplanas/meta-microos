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

RPM_NAME = "python311-imread-0.7.4-3.13.aarch64.rpm"
RPM_HASH = "88b5d8670732f94cd0b576dac042ab45f41e22cbf104c2801abf740729ac7bb103ae4dbb95ef68aa03c379dcdeacae9a3fdb86da64df0836e140e0145a07c820"

RPROVIDES:${PN} += "python3-imread \
python3.11dist-imread \
python311-imread \
python3dist-imread"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
python-abi \
python311-numpy"

inherit rpm
