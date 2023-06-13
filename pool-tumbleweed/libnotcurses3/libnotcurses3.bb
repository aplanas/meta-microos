SUMMARY = "Character graphics and TUI library"
DESCRIPTION = "notcurses facilitates the creation of modern TUI programs, making \
full use of Unicode and 24-bit TrueColor. Its API is similar \
to that of NCURSES, but extends that with z-buffering, rendering \
of images and video using ffmpeg, alpha blending, widgets, palette \
fades, resize awareness, and multithreading support. \
 \
This subpackage contains shared library part of libnotcurses."
LICENSE = "Apache-2.0"

PV = "3.0.9"

RPM_NAME = "libnotcurses3-3.0.9-1.5.aarch64.rpm"
RPM_HASH = "b28e4ef1e94f80c780b5ea9625325368d848c91a86fa83de138a7cfc52293ca878b9d17da640480e317f146d1090c42f2e58a3d88d0f28e276b51bd385b60574"

RPROVIDES:${PN} += "libnotcurses.so.3()(64bit) \
libnotcurses3 \
libnotcurses3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libavcodec.so.60()(64bit) \
libavformat.so.60()(64bit) \
libavutil.so.58()(64bit) \
libc.so.6()(64bit) \
libnotcurses-core.so.3()(64bit) \
libswscale.so.7()(64bit)"

inherit rpm
