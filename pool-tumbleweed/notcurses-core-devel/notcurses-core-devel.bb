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

RPM_NAME = "notcurses-core-devel-3.0.9-1.5.aarch64.rpm"
RPM_HASH = "e08d3d334afc352cadb09bff91ec0321959152297a8f169d8076e5df3620d547b62ef53056dec23b5a172ad8c4b3894e3ccc45544f09d15ac05626afe8aa225d"

RPROVIDES:${PN} += "cmake-NotcursesCore \
notcurses-core-devel \
pkgconfig-notcurses-core"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnotcurses-core3 \
pkgconfig-tinfo"

inherit rpm
