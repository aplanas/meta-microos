SUMMARY = "KDE PIM Libraries: Interface to Contacts"
DESCRIPTION = "This package provides the interface to contacts for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5KontactInterface5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "1538a90b2cf00c6139f2030bec0ca9be90f841d01883595b37c72749b37ddc8f9a8467ef2e913fbf4ea6e907136c641293f4273a9f5e75afacdeaf8489c4feca"

RPROVIDES:${PN} += "kontactinterface \
libKPim5KontactInterface.so.5 \
libKPim5KontactInterface5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5KIOGui.so.5 \
libKF5Parts.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
