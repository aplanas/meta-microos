SUMMARY = "Theora video decompression library"
DESCRIPTION = "Theora is a free and open video compression format from the Xiph.org Foundation. Like all our \
multimedia technology it can be used to distribute film and video online and on disc without \
the licensing and royalty fees or vendor lock-in associated with other formats. \
 \
This subpackage contains the decoder library."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "libtheoradec1-1.1.1-30.9.aarch64.rpm"
RPM_HASH = "8533a0e9ae6cac15f9c42f687b6d416d2b3d81adcfa34190bb1d58d620268512d445c1a24b8e6bd06ff87275db7cd0924d9ea0ac6187546559adfd14d8b3e2ac"

RPROVIDES:${PN} += "libtheoradec.so.1 \
libtheoradec1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
