SUMMARY = "GMIC plugin for krita"
DESCRIPTION = "This is a plugin for krita to provide gmic features."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.0"

RPM_NAME = "krita-plugin-gmic-3.3.0-1.1.aarch64.rpm"
RPM_HASH = "6cca2ed172c2a9474e4a165705b1d286191251af68acf306842d967e812ca378d6e3cac4f0d0e1c4253afb92a81fbf28d899fdd8fc3b26c1068a3dd59a3ced0c"

RPROVIDES:${PN} += "krita-plugin-gmic"

RDEPENDS:${PN} += "gmic-data \
krita \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libfftw3-threads.so.3 \
libgcc-s.so.1 \
libgmic.so.3 \
libgomp.so.1 \
libkritaqmicinterface.so.18 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
