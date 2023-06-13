SUMMARY = "Theora video compression library"
DESCRIPTION = "Theora is a free and open video compression format from the Xiph.org Foundation. Like all our \
multimedia technology it can be used to distribute film and video online and on disc without \
the licensing and royalty fees or vendor lock-in associated with other formats. \
 \
This subpackage contains the encoder library."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "libtheoraenc1-1.1.1-30.8.aarch64.rpm"
RPM_HASH = "66d3f2b0d3cf1e6e0506d671afc911d13cf3062e4c3c287a76baf29325076768ae1500effe61d35897d105b20e78a8c87e2e1474b6ff86242639a52bff5b63cb"

RPROVIDES:${PN} += "libtheoraenc.so.1()(64bit) \
libtheoraenc1 \
libtheoraenc1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libogg.so.0()(64bit)"

inherit rpm
