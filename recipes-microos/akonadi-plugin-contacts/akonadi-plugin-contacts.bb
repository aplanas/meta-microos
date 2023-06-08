SUMMARY = "Plugins for personal contact handling"
DESCRIPTION = "This package provides plugins required by PIM applications to read and write contact data."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "akonadi-plugin-contacts-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "1888c566a41dd19ab601e479916b023cc80a41008aafc4cc2f45ae09d4af3c1259b703b5b035c5f1ff272d0a78cebff3ba2b45345aaa824331ac91a943db6ab7"

RPROVIDES:${PN} += "akonadi-plugin-contacts akonadi-plugin-contacts(aarch-64)"
RDEPENDS:${PN} += "akonadi-contact ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Contacts.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKPim5AkonadiContact.so.5()(64bit) libKPim5AkonadiCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
