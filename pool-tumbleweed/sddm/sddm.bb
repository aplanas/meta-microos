SUMMARY = "QML-based display manager"
DESCRIPTION = "SDDM is a display manager for X11. It uses technologies like QtQuick, \
which in turn gives the designer the ability to create animated user \
interfaces."
LICENSE = "GPL-2.0-or-later"

PV = "0.19.0"

RPM_NAME = "sddm-0.19.0-11.1.aarch64.rpm"
RPM_HASH = "29e7f463233b2e12d569c6def05a52695e632476703ddb5d3e838c3ec8d2ce85183bbb70cd4b15e1d60ec842648a4d268f86326a46c1e9798ee2423eade08fb4"

RPROVIDES:${PN} += "config-sddm \
group-sddm \
qt5qmlimport-SddmComponents.2 \
sddm \
sddm-lang \
user-sddm"

RDEPENDS:${PN} += "/usr/bin/sh \
diffutils \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libXau.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libpam.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
libxcb-xkb.so.1 \
libxcb.so.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-SddmComponents.2 \
sddm-branding \
systemd \
sysuser-shadow \
update-alternatives \
xdm"

inherit rpm
