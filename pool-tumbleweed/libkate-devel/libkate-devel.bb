SUMMARY = "A karaoke and text codec for embedding in Ogg - Development Files"
DESCRIPTION = "Kate is a codec for karaoke and text encapsulation for Ogg. Most of the \
time, this would be multiplexed with audio/video to carry subtitles, \
song lyrics (with or without karaoke data), etc, but doesn't have to be. \
A possible use of a lone Kate stream would be an e-book. Moreover, the \
motion feature gives Kate a powerful means to describe arbitrary curves, \
so hand drawing of shapes can be achieved. \
 \
This was originally meant for karaoke use, but can be used for any \
purpose. Motions can be attached to various semantics, like position, \
color, etc, so scrolling or fading text can be defined. \
 \
This package contains files for developers."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "libkate-devel-0.4.1-26.16.aarch64.rpm"
RPM_HASH = "aa14632bea342153af4671c2c285d752de6a67017f3d126b7d73efd3927eef1cd6a983b5bdc82d8c1c0d00c12a9f433a0fd5c99c2d002d21daff13607776404a"

RPROVIDES:${PN} += "libkate-devel \
pkgconfig-kate \
pkgconfig-oggkate"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libkate1 \
liboggkate1 \
pkgconfig-kate \
pkgconfig-ogg"

inherit rpm
