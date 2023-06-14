SUMMARY = "The Tiff Library (with JPEG and compression support)"
DESCRIPTION = "This package includes the tiff libraries. To link a program with \
libtiff, you will have to add -ljpeg and -lz to include the necessary \
libjpeg and libz in the linking process."
LICENSE = "HPND"

PV = "4.5.0"

RPM_NAME = "libtiff6-4.5.0-3.3.aarch64.rpm"
RPM_HASH = "41d59ab03e6fb991f3cbd36ecb26bcc63bc4c15de5f5d5ba5ce52a3bc75f46327b41a3ac331e316ef22764f0028a56a14a998ddd99482155a93c94c2a923df9e"

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
