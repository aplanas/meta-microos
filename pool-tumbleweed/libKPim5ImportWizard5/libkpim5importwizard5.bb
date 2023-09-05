SUMMARY = "Assistant to import PIM data"
DESCRIPTION = "This package contains the shared libraries used to provide the mail import \
wizard functionality to KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5ImportWizard5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "72ada93d70ca75f36b94318b4939a5ebce527ff186890b8b7b774ec06a2b74c2ffc93578f57301486a1c970258e636e431b2dced1e22728009821fd3e5d5226c"

RPROVIDES:${PN} += "libKPim5ImportWizard.so.5 \
libKPim5ImportWizard5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5IdentityManagement.so.5 \
libKPim5MailCommon.so.5 \
libKPim5MailTransport.so.5 \
libKPim5PimCommonAkonadi.so.5 \
libQt5Core.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqt5keychain.so.1 \
libstdc++.so.6"

inherit rpm
