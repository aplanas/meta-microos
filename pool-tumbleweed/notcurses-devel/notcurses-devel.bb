SUMMARY = "Development files for notcurses"
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

RPM_NAME = "notcurses-devel-3.0.9-1.7.aarch64.rpm"
RPM_HASH = "0502932cf9ba74c97ae496333a406064bd80c22c0cf10b066e1136a279a304e59b77815cccac7c621b17d224b059e4174db838abf69c4d94d7ac086f61f467b2"

RPROVIDES:${PN} += "cmake-Notcurses \
notcurses-devel \
pkgconfig-notcurses \
pkgconfig-notcurses-ffi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnotcurses3 \
pkgconfig-notcurses-core \
pkgconfig-notcurses-ffi"

inherit rpm
