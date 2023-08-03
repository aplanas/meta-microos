SUMMARY = "Examples for the qt6-remoteobjects modules"
DESCRIPTION = "Examples for the qt6-remoteobjects modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-remoteobjects-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "0e1952a12c4d0c7ca6acc8e71c9340c06eb261e6d4c721c098594895674558f47bf7525efa96dff548412f045de2290ee66a9b2e06d65f70add38ee59423ed6f"

RPROVIDES:${PN} += "libqmlqrotimeexampleplugin.so \
qt6-remoteobjects-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Bluetooth.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6RemoteObjects.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
