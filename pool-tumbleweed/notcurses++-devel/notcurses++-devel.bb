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

RPM_NAME = "notcurses++-devel-3.0.9-1.7.aarch64.rpm"
RPM_HASH = "f6ba78e45442b6b5bfbb3443c7196aecadef931fedd4ed4aaa0bb967fc1dd6cb7d9cf37bed51415b208d4a51c5a4081169873e51b79a8ae6e3ce92e14be7856f"

RPROVIDES:${PN} += "cmake-Notcurses++ \
notcurses++-devel \
pkgconfig-notcurses++"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnotcurses++3 \
pkgconfig-notcurses"

inherit rpm
