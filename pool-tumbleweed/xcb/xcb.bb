SUMMARY = "X11 cut&paste utility"
DESCRIPTION = "Xcb provides access to the cut buffers built into every X server. It \
allows the buffers to be manipulated either via the command line or \
with the mouse in a point and click manner.  The buffers can be used as \
holding pens to store and retrieve arbitrary data fragments, so any \
number of different pieces of data can be saved and recalled later. The \
program is designed primarily for use with textual data."
LICENSE = "MIT"

PV = "2.5"

RPM_NAME = "xcb-2.5-203.9.aarch64.rpm"
RPM_HASH = "23fc39874c4e1d51e3c7744dd4215c34d6a72f97ba16af75dccb10d9f7cc179dd9568c3557b112c3dd30749e5b24d27810c9e0b65889bfaf044d1673b84caf76"

RPROVIDES:${PN} += "xcb \
xcb(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXt.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
