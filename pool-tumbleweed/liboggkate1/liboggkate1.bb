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

RPM_NAME = "liboggkate1-0.4.1-26.16.aarch64.rpm"
RPM_HASH = "a746d68f63fbe18ba31e2d23dc645ce3f7d36b6fe183a891c3eab30dfa8fc96c535d830b6095336c44be6157fd668f8d65dae210354d2dc6b311ae6fc4e545c3"

RPROVIDES:${PN} += "liboggkate.so.1 \
liboggkate1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkate.so.1"

inherit rpm
