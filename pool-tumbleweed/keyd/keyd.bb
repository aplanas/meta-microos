SUMMARY = "A key remapping daemon for linux"
DESCRIPTION = "Linux lacks a good key remapping solution. \
In order to achieve satisfactory results a medley of tools need to be employed \
(e.g xcape, xmodmap) with the end result often being tethered to a specified \
environment (X11). \
keyd attempts to solve this problem by providing a flexible system wide daemon \
which remaps keys using kernel level input primitives (evdev, uinput)."
LICENSE = "MIT"

PV = "2.4.3"

RPM_NAME = "keyd-2.4.3-1.2.aarch64.rpm"
RPM_HASH = "55658a622e7d1d2590570f5b457408e396d67e6e32854d38c6459aa3ffd3f3dbfb02c7cc01965adc79929e7be615ba4ad861a498d295b20a106ac1aeb542ec06"

RPROVIDES:${PN} += "keyd"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
libc.so.6 \
python3-xlib \
sed \
shadow"

inherit rpm
