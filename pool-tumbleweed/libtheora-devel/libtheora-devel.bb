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

RPM_NAME = "libtheora-devel-1.1.1-30.8.aarch64.rpm"
RPM_HASH = "6b00395cd381115dedb8f3a84e5ed920884032f96c74fa6478640b9e4632b79b7a093fecd90ae59fff2b4a285eae21feb17b7ed8c0e17ef7ecde6ddcc9eb4f2c"

RPROVIDES:${PN} += "libtheora-devel \
libtheora-devel(aarch-64) \
pkgconfig(theora) \
pkgconfig(theoradec) \
pkgconfig(theoraenc)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libogg-devel \
libtheora0 \
libtheoradec1 \
libtheoraenc1 \
pkgconfig(ogg) \
pkgconfig(theoradec)"

inherit rpm
