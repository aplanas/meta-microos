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

RPM_NAME = "python3-notcurses-3.0.9-1.8.aarch64.rpm"
RPM_HASH = "d692e1e47da9d8667c51f17461ff43c61ed88d85f239df22aeb42adab24598c5df5123e48cdef93d33fc27697aeac046912b724b28e341883a9318d715a29b5d"

RPROVIDES:${PN} += "python3-notcurses \
python3.11dist-notcurses \
python3dist-notcurses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnotcurses.so.3 \
python-abi"

inherit rpm
