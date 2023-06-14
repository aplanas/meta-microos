SUMMARY = "Assistant to import PIM data"
DESCRIPTION = "This package contains the shared libraries used to provide the mail import \
wizard functionality to KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5ImportWizard5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "29d1c4de52046a562bfc0db0ec8e22bbba246fc9483ccb885b4308a769e0b562096a0d02d48d32fc0f19551261502a67059fdba6b1add4b06a47001ee26715b8"

RPROVIDES:${PN} += "libKPim5ImportWizard.so.5 \
libKPim5ImportWizard5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5PimCommonAkonadi.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5IdentityManagement.so.5 \
libKPim5MailCommon.so.5 \
libKPim5MailTransport.so.5 \
libQt5Core.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqt5keychain.so.1 \
libstdc++.so.6"

inherit rpm
