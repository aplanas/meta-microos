SUMMARY = "Theora video decompression library"
DESCRIPTION = "Theora is a free and open video compression format from the Xiph.org Foundation. Like all our \
multimedia technology it can be used to distribute film and video online and on disc without \
the licensing and royalty fees or vendor lock-in associated with other formats. \
 \
This subpackage contains the decoder library."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "libtheoradec1-1.1.1-30.8.aarch64.rpm"
RPM_HASH = "b04110ca1f038da1c593da4d9f584b80c7714d3fae0b4479c417806b64744d0aa47bb4aa66138a349108b9716ee6c1c3bf79caad1c1e057bfb94d7629519b85a"

RPROVIDES:${PN} += "libtheoradec.so.1()(64bit) \
libtheoradec1 \
libtheoradec1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
