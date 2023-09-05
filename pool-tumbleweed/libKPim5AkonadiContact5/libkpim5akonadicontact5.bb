SUMMARY = "Library for personal contact handling"
DESCRIPTION = "This package provides a library used for handling personal contacts, \
as part of the KDE Personal Information Management (PIM) software."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5AkonadiContact5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "3c2224d938b97109af16a97b2ba402a48f6dab7394f14600b45c04592ac8b8f33fc0c48051c2c552b1c6f9af161282be40b76c8356cc2897dc90b90ceb87242b"

RPROVIDES:${PN} += "libKPim5AkonadiContact.so.5 \
libKPim5AkonadiContact5"

RDEPENDS:${PN} += "/sbin/ldconfig \
akonadi-contact \
ld-linux-aarch64.so.1 \
libGrantlee-Templates.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5WidgetsAddons.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5GrantleeTheme.so.5 \
libKPim5Mime.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
