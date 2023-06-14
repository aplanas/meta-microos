SUMMARY = "Character graphics and TUI library demos"
DESCRIPTION = "notcurses facilitates the creation of modern TUI programs, making \
full use of Unicode and 24-bit TrueColor. Its API is similar \
to that of NCURSES, but extends that with z-buffering, rendering \
of images and video using ffmpeg, alpha blending, widgets, palette \
fades, resize awareness, and multithreading support. \
 \
This subpackage contains the demo binaries for the notcurses \
library."
LICENSE = "Apache-2.0"

PV = "3.0.9"

RPM_NAME = "notcurses-demos-3.0.9-1.5.aarch64.rpm"
RPM_HASH = "87d87558fcba4c7957941aaae2aca7c9a5cc9c7d74881b89bb261f4c8b66397633944d6b1c214dbd3068c34ae196cca1d57af2d6432ade363c6532bbc6bb03e2"

RPROVIDES:${PN} += "notcurses-demos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdeflate.so.0 \
libgcc-s.so.1 \
libnotcurses++.so.3 \
libnotcurses-core.so.3 \
libnotcurses.so.3 \
libstdc++.so.6"

inherit rpm
