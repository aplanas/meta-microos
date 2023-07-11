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

RPM_NAME = "notcurses-demos-3.0.9-1.6.aarch64.rpm"
RPM_HASH = "4fc337cbcf845d9a94a5dbaeaecaf9048f92defb338fdd697a4ef302c4135f06caa04fb0f3bcfb363df00471bea912ef17b73f40057a90616c53fbc45ed4654f"

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
