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

RPM_NAME = "libkate-devel-0.4.1-26.15.aarch64.rpm"
RPM_HASH = "b6666c1b7c029cd3f08bc0ef5b017a7c25d45fb0b80e1646c56ddca64780d371d228e5165f09d8e7b79da6012219d6ac65957afa302adef4bae527cdf828dd02"

RPROVIDES:${PN} += "libkate-devel \
libkate-devel(aarch-64) \
pkgconfig(kate) \
pkgconfig(oggkate)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libkate1 \
liboggkate1 \
pkgconfig(kate) \
pkgconfig(ogg)"

inherit rpm
