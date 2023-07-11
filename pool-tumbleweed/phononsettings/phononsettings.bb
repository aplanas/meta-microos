SUMMARY = "Settings Tool for Phonon Multimedia Platform Abstraction"
DESCRIPTION = "Phonon is a cross-platform portable Multimedia Support Abstraction, \
which allows you to play multiple audio or video formats with the same \
quality on all platforms, no matter which underlying architecture is \
used."
LICENSE = "LGPL-2.0-only | LGPL-3.0-only"

PV = "4.11.1"

RPM_NAME = "phononsettings-4.11.1-3.10.aarch64.rpm"
RPM_HASH = "bde25ac24a9434fb37de028b7768130befb348948c6d3e689532b592d53c6f692178d986de5aef2bb820b37d992dae764074f9764b091e65bf6530e8bed2b124"

RPROVIDES:${PN} += "phononsettings"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libphonon4qt5.so.4 \
libstdc++.so.6"

inherit rpm
