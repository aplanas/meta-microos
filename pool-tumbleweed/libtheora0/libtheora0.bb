SUMMARY = "Theora video compression codec"
DESCRIPTION = "Theora is a free and open video compression format from the Xiph.org Foundation. Like all our \
multimedia technology it can be used to distribute film and video online and on disc without \
the licensing and royalty fees or vendor lock-in associated with other formats. \
 \
Theora scales from postage stamp to HD resolution, and is considered particularly competitive \
at low bitrates. It is in the same class as MPEG-4/DiVX, and like the Vorbis audio codec it \
has lots of room for improvement as encoder technology develops. \
 \
Theora is in full public release as of November 3, 2008. The bitstream format for Theora I \
was frozen Thursday, 2004 July 1. All bitstreams encoded since that date will remain compatible \
with future releases. \
 \
The package contains the library that can decode and encode Theora streams. Theora is also \
able to playback VP3 streams. \
 \
Authors: \
-------- \
    the Xiph.Org Foundation http://www.xiph.org/"
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "libtheora0-1.1.1-30.8.aarch64.rpm"
RPM_HASH = "8e3ba3ea6c34f78ec774fa9e201e00ebc63e6068def5e708b944257f4ecb826ec5e7ad4225cf541b7952225dfc24ffbb659274000d359ddb1a11e767fab3c6d5"

RPROVIDES:${PN} += "libtheora \
libtheora.so.0()(64bit) \
libtheora.so.0(libtheora.so.1.0)(64bit) \
libtheora0 \
libtheora0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libogg.so.0()(64bit)"

inherit rpm
