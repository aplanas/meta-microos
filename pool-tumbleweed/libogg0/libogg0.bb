SUMMARY = "Ogg Bitstream Library"
DESCRIPTION = "Libogg is a library for manipulating Ogg bitstreams.  It handles both \
making Ogg bitstreams and getting packets from Ogg bitstreams. \
 \
Ogg is the native bitstream format of libvorbis (Ogg Vorbis audio \
codec) and libtheora (Theora video codec)."
LICENSE = "BSD-3-Clause"

PV = "1.3.5"

RPM_NAME = "libogg0-1.3.5-1.7.aarch64.rpm"
RPM_HASH = "d20cea335225a5f4a564c4beed766840746097065c36805bf436f4fa6ed5850d4607d09579b3922565c29f4b70f1a26e48b7fbe72764c46e09d58f68c9b37cd8"

RPROVIDES:${PN} += "libogg.so.0 \
libogg0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
