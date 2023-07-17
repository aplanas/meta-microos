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

RPM_NAME = "python3-notcurses-3.0.9-1.7.aarch64.rpm"
RPM_HASH = "ed74631ae69be4145c001ba5d7ced75fd7ea5a8c80cfa833aa205ae77a1529c4e2299d62383e284d758ee52f58f7a326a85ee46c14dbe5e39581388fa1acde31"

RPROVIDES:${PN} += "python3-notcurses \
python3.11dist-notcurses \
python3dist-notcurses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnotcurses.so.3 \
python-abi"

inherit rpm
