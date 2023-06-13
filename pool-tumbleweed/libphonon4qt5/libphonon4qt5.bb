SUMMARY = "Phonon Multimedia Platform Abstraction"
DESCRIPTION = "Phonon is a cross-platform portable Multimedia Support Abstraction, \
which allows you to play multiple audio or video formats with the same \
quality on all platforms, no matter which underlying architecture is \
used."
LICENSE = "LGPL-2.0-or-later"

PV = "4.11.1"

RPM_NAME = "libphonon4qt5-4.11.1-3.9.aarch64.rpm"
RPM_HASH = "984b7460b92ca9d7741a169eb26fdf6a6146f4420e0f69da0f5cdd26d08b4a543ad4078a71aa6c3881729385509ecbaa50c4bbf5d4ba27597fa083845624f434"

RPROVIDES:${PN} += "libphonon4qt5 \
libphonon4qt5(aarch-64) \
libphonon4qt5.so.4()(64bit) \
libphonon4qt5experimental.so.4()(64bit) \
phonon4qt5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libpulse-mainloop-glib.so.0()(64bit) \
libpulse-mainloop-glib.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
