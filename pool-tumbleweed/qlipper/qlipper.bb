SUMMARY = "Clipboard history applet"
DESCRIPTION = "A clipboard history applet."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.2"

RPM_NAME = "qlipper-5.1.2-1.12.aarch64.rpm"
RPM_HASH = "2a6b329b73d074461a0fb9f75707d6fa5597a2431f5291dfc490a70c8226dcac39c563b7827d6cbc8207e4c8675d52613255b7b7e354d40d8f18c0c291182d36"

RPROVIDES:${PN} += "application() \
application(qlipper.desktop) \
qlipper \
qlipper(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
