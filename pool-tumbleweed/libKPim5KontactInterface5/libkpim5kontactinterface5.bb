SUMMARY = "KDE PIM Libraries: Interface to Contacts"
DESCRIPTION = "This package provides the interface to contacts for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5KontactInterface5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "57ba3486eacc7e3fc3cef5d8095ceedf0e472d88838ad4758db45abf881b59c29b43d621fcdd1a9ccdb2f392595073c0453980d110f16f273d148ceb4f503b7f"

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
