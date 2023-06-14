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

RPM_NAME = "sfftobmp-3.1.4-8.16.aarch64.rpm"
RPM_HASH = "6ff5f0061ec3b505f7ac6e99c2c0c102bb7fb24b0ed8e0b4fb35a25c8e69859f618578b67cb6c1ec55f59bd7609132669eec4207f543bafdd7a9e516747cfdfb"

RPROVIDES:${PN} += "sfftobmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
