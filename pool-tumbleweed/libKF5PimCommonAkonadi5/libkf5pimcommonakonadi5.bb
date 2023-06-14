SUMMARY = "The PimCommon Akonadi Library"
DESCRIPTION = "The PimCommon Akonadi library"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKF5PimCommonAkonadi5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "687d2206877dfec4fa64ca950d11e3ca0bdb6cd1c3007d40b997d2a3157e9a815832a7eb97bdcbd9e6ba9e94295562dc9d09855f55c9d8f8d09b801cd9596157"

RPROVIDES:${PN} += "libKF5PimCommonAkonadi.so.5 \
libKF5PimCommonAkonadi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemModels.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOCore.so.5 \
libKF5PimCommon.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5AkonadiContact.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiSearchPIM.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5IMAP.so.5 \
libKPim5Ldap.so.5 \
libKPim5Libkdepim.so.5 \
libKPim5TextEdit.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
