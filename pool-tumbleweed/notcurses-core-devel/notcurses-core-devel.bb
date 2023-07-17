SUMMARY = "Development files for notcursescore"
DESCRIPTION = "notcurses facilitates the creation of modern TUI programs, making \
full use of Unicode and 24-bit TrueColor. Its API is similar \
to that of NCURSES, but extends that with z-buffering, rendering \
of images and video using ffmpeg, alpha blending, widgets, palette \
fades, resize awareness, and multithreading support. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libnotcurses-core."
LICENSE = "Apache-2.0"

PV = "3.0.9"

RPM_NAME = "notcurses-core-devel-3.0.9-1.7.aarch64.rpm"
RPM_HASH = "b2501c8d3108e512f7117f86b478147547b1ed86884720cc04ce8554183f2472c9af88984bddc1338ced5bcddd35788a66319c130ead3ab129a12008a2d97522"

RPROVIDES:${PN} += "cmake-NotcursesCore \
notcurses-core-devel \
pkgconfig-notcurses-core"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnotcurses-core3 \
pkgconfig-tinfo"

inherit rpm
