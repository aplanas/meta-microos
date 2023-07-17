SUMMARY = "Examples for the qt6-remoteobjects modules"
DESCRIPTION = "Examples for the qt6-remoteobjects modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-remoteobjects-examples-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "c8d1df8c56a0b7a3ca9036c6fc788b75844b47717360fe554464bcb786891ae51050a5fe86dfd1cfbea475320ac94b5d47e64b8a7e7ff982c2f0189d6055bb7e"

RPROVIDES:${PN} += "libqmlqrotimeexampleplugin.so \
qt6-remoteobjects-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Bluetooth.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6RemoteObjects.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
