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

RPM_NAME = "notcurses-demos-3.0.9-1.8.aarch64.rpm"
RPM_HASH = "9db1ef8305332c2e99d0d9f1c87b9513d0492b02c544ed125cbfcbc79479b181b8d301336c5b54122872c8df181182edadc63f87c30b8e6f58773ea70d7cf5e7"

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
