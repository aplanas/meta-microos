SUMMARY = "Phonon Multimedia Platform Abstraction"
DESCRIPTION = "Phonon is a cross-platform portable Multimedia Support Abstraction, \
which allows you to play multiple audio or video formats with the same \
quality on all platforms, no matter which underlying architecture is \
used."
LICENSE = "LGPL-2.0-or-later"

PV = "4.11.1"

RPM_NAME = "libphonon4qt5-4.11.1-3.10.aarch64.rpm"
RPM_HASH = "6c608c80bd51beef40511352d016622648d25a83d37dd94ce2d512e05c47173b6513d927c972d849daf8c735322e6043b9c70b82fc76ea1b028dd368fc032869"

RPROVIDES:${PN} += "libphonon4qt5 \
libphonon4qt5.so.4 \
libphonon4qt5experimental.so.4 \
phonon4qt5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
