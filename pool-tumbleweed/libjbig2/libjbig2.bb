SUMMARY = "JBIG1 lossless image compression library"
DESCRIPTION = "JBIG-KIT provides a portable library of compression and decompression \
functions with a documented interface that you can include very easily \
into your image or document processing software. In addition, JBIG-KIT \
provides ready-to-use compression and decompression programs with a \
simple command line interface (similar to the converters found in \
netpbm). \
 \
JBIG-KIT implements the specification: \
    ISO/IEC 11544:1993 and ITU-T Recommendation T.82(1993): \
     Information technology — Coded representation of picture and audio \
     information — Progressive bi-level image compression \
 \
which is commonly referred to as the “JBIG1 standard”"
LICENSE = "GPL-2.0-or-later"

PV = "2.1"

RPM_NAME = "libjbig2-2.1-4.4.aarch64.rpm"
RPM_HASH = "9218d8a6fbdd83de74eadc41f954fffa1a0722ab5677bb906fcd3bad4774252d62c058e38e20b6fee6b3151732ab1747c067ebe56ef5a98f8e15ac82331f0a13"

RPROVIDES:${PN} += "libjbig \
libjbig.so.2()(64bit) \
libjbig2 \
libjbig2(aarch-64) \
libjbig85.so.2()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
