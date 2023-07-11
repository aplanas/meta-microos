SUMMARY = "Development files for liballegro_video"
DESCRIPTION = "Development files needed to build applications which use liballegro_video."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_video5_2-devel-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "5afedc7b3f448659fdbf19d5e4ec58742645b90ccd0afc264d41d64bde2e4c98e9bd4fcf796ac814ff29f7e16b3459c177002708b51025944e576290a9eba861"

RPROVIDES:${PN} += "liballegro-video5-2-devel \
pkgconfig-allegro-video-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-video5-2 \
pkgconfig-allegro-audio-5"

inherit rpm
