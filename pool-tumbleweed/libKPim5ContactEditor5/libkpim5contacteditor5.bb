SUMMARY = "Library for personal contact handling"
DESCRIPTION = "This package provides a library used for handling personal contacts, \
as part of the KDE Personal Information Management (PIM) software."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5ContactEditor5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "552ec6240cd5427b070dc6873ed6188cd2cb0f24138c590ebf9ad5f3347d4fdd7c5b29253df7da3d5c06a05f8f960d4bfa833e934e324a321e478e1d72426223"

RPROVIDES:${PN} += "libKPim5ContactEditor.so.5 \
libKPim5ContactEditor5"

RDEPENDS:${PN} += "/sbin/ldconfig \
akonadi-contact \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
