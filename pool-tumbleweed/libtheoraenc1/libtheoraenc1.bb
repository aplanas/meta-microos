SUMMARY = "Theora video compression library"
DESCRIPTION = "Theora is a free and open video compression format from the Xiph.org Foundation. Like all our \
multimedia technology it can be used to distribute film and video online and on disc without \
the licensing and royalty fees or vendor lock-in associated with other formats. \
 \
This subpackage contains the encoder library."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "libtheoraenc1-1.1.1-30.9.aarch64.rpm"
RPM_HASH = "54adf589bab61b387510ef9f31170ed39de2c779f11828d1d541df9335b575ce15513aa6a61003afab09c036d972fa6aece5f42312d0882d3547fd6bae2d6fac"

RPROVIDES:${PN} += "libtheoraenc.so.1 \
libtheoraenc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libogg.so.0"

inherit rpm
