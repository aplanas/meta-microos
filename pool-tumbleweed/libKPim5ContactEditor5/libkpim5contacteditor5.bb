SUMMARY = "Library for personal contact handling"
DESCRIPTION = "This package provides a library used for handling personal contacts, \
as part of the KDE Personal Information Management (PIM) software."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5ContactEditor5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "157cf720c8ebb51faf3fa08eec4d625e5499b2ac17872c6269c178cee5f1d2d56ddd60aa5c00ba3e16b26809e01cf92e0ff9964e373dfcc9a085ae6a70a2a4ad"

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
