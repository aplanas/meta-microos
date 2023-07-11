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

RPM_NAME = "python39-imread-0.7.4-3.13.aarch64.rpm"
RPM_HASH = "521c96dd201b6c573fc93bae54c9e3b602f690ce095b39578db18b32143e3c16fb15bbb86f87cede690f95e898179644b9cd1f9abe83e9261d0ab0a7ffe37435"

RPROVIDES:${PN} += "python3.9dist-imread \
python39-imread \
python3dist-imread"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
python-abi \
python39-numpy"

inherit rpm
