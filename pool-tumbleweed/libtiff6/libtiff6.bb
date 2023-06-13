SUMMARY = "The Tiff Library (with JPEG and compression support)"
DESCRIPTION = "This package includes the tiff libraries. To link a program with \
libtiff, you will have to add -ljpeg and -lz to include the necessary \
libjpeg and libz in the linking process."
LICENSE = "HPND"

PV = "4.5.0"

RPM_NAME = "libtiff6-4.5.0-3.3.aarch64.rpm"
RPM_HASH = "41d59ab03e6fb991f3cbd36ecb26bcc63bc4c15de5f5d5ba5ce52a3bc75f46327b41a3ac331e316ef22764f0028a56a14a998ddd99482155a93c94c2a923df9e"

RPROVIDES:${PN} += "libtiff \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libtiff.so.6(LIBTIFF_4.1)(64bit) \
libtiff.so.6(LIBTIFF_4.2)(64bit) \
libtiff.so.6(LIBTIFF_4.3)(64bit) \
libtiff.so.6(LIBTIFF_4.4)(64bit) \
libtiff.so.6(LIBTIFF_4.5)(64bit) \
libtiff6 \
libtiff6(aarch-64) \
libtiffxx.so.6()(64bit) \
libtiffxx.so.6(LIBTIFFXX_4.0)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libjbig.so.2()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
liblzma.so.5()(64bit) \
liblzma.so.5(XZ_5.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
