SUMMARY = "Library for personal contact handling"
DESCRIPTION = "This package provides a library used for handling personal contacts, \
as part of the KDE Personal Information Management (PIM) software."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5AkonadiContact5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "0a06fbb4f36bec9ff719dac6e3077d6e4464d7d3cbaba80bd842ad3c782afffabb38b91efefb255c591207b21aa136b6b69036f79756cbe2807cf3ce04ac782d"

RPROVIDES:${PN} += "libKPim5AkonadiContact.so.5 \
libKPim5AkonadiContact5"

RDEPENDS:${PN} += "/sbin/ldconfig \
akonadi-contact \
ld-linux-aarch64.so.1 \
libGrantlee-Templates.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5I18nLocaleData.so.5 \
libKF5IconThemes.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5Prison.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5ContactEditor.so.5 \
libKPim5GrantleeTheme.so.5 \
libKPim5Mime.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
