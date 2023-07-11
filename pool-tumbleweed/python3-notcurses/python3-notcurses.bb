SUMMARY = "Python3 bindings for the notcurses library"
DESCRIPTION = "notcurses facilitates the creation of modern TUI programs, making \
full use of Unicode and 24-bit TrueColor. Its API is similar \
to that of NCURSES, but extends that with z-buffering, rendering \
of images and video using ffmpeg, alpha blending, widgets, palette \
fades, resize awareness, and multithreading support. \
 \
This subpackage contains the python3 bindings for the notcurses \
library."
LICENSE = "Apache-2.0"

PV = "3.0.9"

RPM_NAME = "python3-notcurses-3.0.9-1.6.aarch64.rpm"
RPM_HASH = "76174ceb9f36c7c4e115020c48bf0b47fd27303fbef3417824537a56d7234e6666774f5ab916da67ad7ed02cf14d059673501eb5859244dfe0a42e6b63ab45bc"

RPROVIDES:${PN} += "python3-notcurses \
python3.11dist-notcurses \
python3dist-notcurses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnotcurses.so.3 \
python-abi"

inherit rpm
