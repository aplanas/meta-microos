SUMMARY = "KDE PIM Libraries for Akonadi Contacts"
DESCRIPTION = "This package provides a library used for handling personal contacts, \
as part of the KDE Personal Information Management (PIM) software."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "akonadi-contact-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "85a0d18758fbec60ba32eea42b596ae4552677d495ee06b50facad7bad229596afdf86580dd4688ef22f2edc60b5ddee84b7c74e2a7950faa7e1357803ae3ac7"

RPROVIDES:${PN} += "akonadi-contact akonadi-contact(aarch-64) akonadi-contacts"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5Contacts.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKPim5AkonadiContact5 libKPim5AkonadiCore.so.5()(64bit) libKPim5AkonadiWidgets.so.5()(64bit) libKPim5ContactEditor.so.5()(64bit) libKPim5ContactEditor5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
