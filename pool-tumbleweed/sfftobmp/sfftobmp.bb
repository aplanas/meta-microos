SUMMARY = "Tool to convert Structured Fax Files (.sff) to other image formats"
DESCRIPTION = "The CAPI interface for programming ISDN hardware expects and gives \
faxes in the 'Structured Fax File' (SFF) format. \
 \
SffToBmp is a converter tool, written in C++, to transform SFF files to \
BMP, JPEG or multipage TIFF format. In addition generation of PBM files \
(Portable Bitmap) is also possible which can be transformed into nearby \
all other graphics formats using the PBMPLUS tools that are included in \
almost every Linux distribution nowadays."
LICENSE = "MIT"

PV = "3.1.4"

RPM_NAME = "sfftobmp-3.1.4-8.17.aarch64.rpm"
RPM_HASH = "5081558e68299981da224e74f42c63dc5bd3a92e25515c841ac7039ebfd26f91574c1305e4acb87e925d58f3e0f28ea43a403b9b221bc86a33fc806f32604fa1"

RPROVIDES:${PN} += "sfftobmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
