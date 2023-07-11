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

RPM_NAME = "libjbig2-2.1-4.5.aarch64.rpm"
RPM_HASH = "77177eb00d059b603a3654b8ae439626624aada805afbcf9d3b0a216777a2a302a6530df469571a6b7715970bf758585af8e136a549afe2bed4883c7ccbd2fb3"

RPROVIDES:${PN} += "libjbig \
libjbig.so.2 \
libjbig2 \
libjbig85.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
