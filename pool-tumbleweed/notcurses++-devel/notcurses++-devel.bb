SUMMARY = "Development files for notcurses++"
DESCRIPTION = "notcurses facilitates the creation of modern TUI programs, making \
full use of Unicode and 24-bit TrueColor. Its API is similar \
to that of NCURSES, but extends that with z-buffering, rendering \
of images and video using ffmpeg, alpha blending, widgets, palette \
fades, resize awareness, and multithreading support. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libnotcurses."
LICENSE = "Apache-2.0"

PV = "3.0.9"

RPM_NAME = "notcurses++-devel-3.0.9-1.8.aarch64.rpm"
RPM_HASH = "d413286017f777c5a1cb334de08cbc77b82cd60159a04efcd3e58183658797c59a5d8facdaed62dcd80c259bf23d1392922af5466f36244315238d3009141efb"

RPROVIDES:${PN} += "cmake-Notcurses++ \
notcurses++-devel \
pkgconfig-notcurses++"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnotcurses++3 \
pkgconfig-notcurses"

inherit rpm
