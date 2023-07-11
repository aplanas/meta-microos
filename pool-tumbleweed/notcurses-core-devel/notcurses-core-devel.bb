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

RPM_NAME = "notcurses-core-devel-3.0.9-1.6.aarch64.rpm"
RPM_HASH = "75a2950dfaddcfcd875c42851abbe377c9fb34c3ab6afc388938b6e12b30135b3c35ed01818a12cd170017f0ae36eea5e1c1f0ab6eb9f68b2febf9f6848a9221"

RPROVIDES:${PN} += "cmake-NotcursesCore \
notcurses-core-devel \
pkgconfig-notcurses-core"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnotcurses-core3 \
pkgconfig-tinfo"

inherit rpm
