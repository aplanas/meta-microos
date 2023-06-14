SUMMARY = "GUI for DreamSourceLab USB-based instruments"
DESCRIPTION = "GUI for DreamSourceLab USB-based instruments"
LICENSE = "GPL-3.0-or-later"

PV = "1.2.2"

RPM_NAME = "DSView-1.2.2-1.3.aarch64.rpm"
RPM_HASH = "ff94a8ee378cd79bb31573e0ce5fbd90c980463aeb183e1cb6a8bef8466920f858ca2db48754ee9daf70a5c731d370ec4e7fc230df77b1d791a734093eb0ca03"

RPROVIDES:${PN} += "DSView"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libm.so.6 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
libusb-1.0.so.0 \
libz.so.1"

inherit rpm
