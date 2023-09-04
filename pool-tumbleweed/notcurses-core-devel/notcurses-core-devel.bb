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

RPM_NAME = "notcurses-core-devel-3.0.9-1.8.aarch64.rpm"
RPM_HASH = "31ac5a887133d27b6a05629cdb9b981f0ad2ccf337117b72b4d3071c4bd1f57db908391fc79e2538017447fc5ca45530da79193ea5fac0037902d63290f4442e"

RPROVIDES:${PN} += "cmake-NotcursesCore \
notcurses-core-devel \
pkgconfig-notcurses-core"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnotcurses-core3 \
pkgconfig-tinfo"

inherit rpm
