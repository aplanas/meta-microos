SUMMARY = "The Tiff Library (with JPEG and compression support)"
DESCRIPTION = "This package includes the tiff libraries. To link a program with \
libtiff, you will have to add -ljpeg and -lz to include the necessary \
libjpeg and libz in the linking process."
LICENSE = "HPND"

PV = "4.5.1"

RPM_NAME = "libtiff6-4.5.1-1.1.aarch64.rpm"
RPM_HASH = "94ef3136cb96e74c7008c26b622792af723088ad89ba2d7fc5234250e9208a7988876d6d2ab5be8f4fada0373611fb842b3ba9e231dda7f2cdd9bb8acf1273ff"

RPROVIDES:${PN} += "libtiff \
libtiff.so.6 \
libtiff6 \
libtiffxx.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjbig.so.2 \
libjpeg.so.8 \
liblzma.so.5 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
