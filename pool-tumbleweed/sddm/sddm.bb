SUMMARY = "QML-based display manager"
DESCRIPTION = "SDDM is a display manager for X11 and Wayland. It uses technologies like \
QtQuick, which gives the designer the ability to create animated user \
interfaces."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.0"

RPM_NAME = "sddm-0.20.0-2.1.aarch64.rpm"
RPM_HASH = "ceb3c2b56879afe85ac7ffa002d607347abee07765738bff091d7cc8df1b7a74df1ea6d5d6f409e7c1901bf48bb1c7f7fa4b8fa9240303108354ea314148d09e"

RPROVIDES:${PN} += "config-sddm \
group-sddm \
qt5qmlimport-SddmComponents.2 \
sddm \
sddm-lang \
user-sddm"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/update-alternatives \
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
