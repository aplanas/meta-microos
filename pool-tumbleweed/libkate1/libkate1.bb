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

RPM_NAME = "libkate1-0.4.1-26.15.aarch64.rpm"
RPM_HASH = "6c26e8f59539df5b8fb83438f8ed6893bfd3a13119c1dc1029ffa80ef342ebf3c062b9488a6c194f102cf07af5fed180249c247ce45b74406396b48f15133124"

RPROVIDES:${PN} += "libkate.so.1 \
libkate1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
