SUMMARY = "Assistant to import PIM data"
DESCRIPTION = "This package contains the shared libraries used to provide the mail import \
wizard functionality to KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5ImportWizard5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "c373e662591986a5f989d371cbda83592e69fc06c16a84b44e098f3ef23915d63f7c128612cd8f1827af986592aef9682310a413fe2adf5179aa6f4b61b2a8c3"

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
