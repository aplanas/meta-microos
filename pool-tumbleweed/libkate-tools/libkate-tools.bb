SUMMARY = "A karaoke and text codec for embedding in Ogg"
DESCRIPTION = "Kate is a codec for karaoke and text encapsulation for Ogg. Most of the \
time, this would be multiplexed with audio/video to carry subtitles, \
song lyrics (with or without karaoke data), etc, but doesn't have to be. \
A possible use of a lone Kate stream would be an e-book. Moreover, the \
motion feature gives Kate a powerful means to describe arbitrary curves, \
so hand drawing of shapes can be achieved. \
 \
This was originally meant for karaoke use, but can be used for any \
purpose. Motions can be attached to various semantics, like position, \
color, etc, so scrolling or fading text can be defined."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "libkate-tools-0.4.1-26.15.aarch64.rpm"
RPM_HASH = "261b89ed52cd36fce3ff235f3cc5705a36cdb5b8055e41e6454f462007793d2b807105935a2ef93a930fb807bf3756004cfd80770195d0dc98c5716a9f2b69aa"

RPROVIDES:${PN} += "libkate-tools \
libkate-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkate.so.1()(64bit) \
libogg.so.0()(64bit) \
liboggkate.so.1()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit)"

inherit rpm
