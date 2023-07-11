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

RPM_NAME = "libtheora-devel-1.1.1-30.9.aarch64.rpm"
RPM_HASH = "32e0ef8e43a6192e2c0e0b8edf52615899276ef6d920acf6b13032d558ee46c4afa9f3ac47862eaf3439f3e406d1b14f35470454aafa01b147f344dcdd1ffc7c"

RPROVIDES:${PN} += "libtheora-devel \
pkgconfig-theora \
pkgconfig-theoradec \
pkgconfig-theoraenc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libogg-devel \
libtheora0 \
libtheoradec1 \
libtheoraenc1 \
pkgconfig-ogg \
pkgconfig-theoradec"

inherit rpm
