SUMMARY = "Mouse Event to Key Event Mapper Daemon"
DESCRIPTION = "A daemon for X11, which watches for mouse wheel actions and outputs them as \
keypresses. It can be configured separately for different windows. It also \
allows input from it's own (included) gpm, or from jamd, or from XFree86 ZAxis \
mouse wheel conversion."
LICENSE = "GPL-2.0+"

PV = "1.0.0pre12"

RPM_NAME = "imwheel-1.0.0pre12-6.25.aarch64.rpm"
RPM_HASH = "30315662c8719fe87c86aea5d437d48f22b8c2dc12359166d5955a53d0241de2c0d8e44322c15fb3278cc1ba484820030584bcfd0c5cf9b4976b85acfcd74ed5"

RPROVIDES:${PN} += "config-imwheel \
imwheel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXmu.so.6 \
libXtst.so.6 \
libc.so.6"

inherit rpm
