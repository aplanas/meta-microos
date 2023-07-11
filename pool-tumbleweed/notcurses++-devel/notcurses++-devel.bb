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

RPM_NAME = "notcurses++-devel-3.0.9-1.6.aarch64.rpm"
RPM_HASH = "1764b4eea53b1a83d15308d57abeb97edbc8038eb2cf462c6ad165dcb0ecde899970bf81d9e65ef659d7e18ac4c7a434c105beff41d54857ce6f1af7b9a7d127"

RPROVIDES:${PN} += "cmake-Notcurses++ \
notcurses++-devel \
pkgconfig-notcurses++"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnotcurses++3 \
pkgconfig-notcurses"

inherit rpm
