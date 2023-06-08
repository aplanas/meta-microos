SUMMARY = "Aditional components for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains aditional command line utilities."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.105.0"

RPM_NAME = "baloo5-tools-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "bd574639c7285aae420e368dcb21bbd4da71c36df48cb2d3df31429ac4e8f6aa98d7bccfd2d0c253ecf7cc2055210db780ac6b7eeba8613a2652da57f19cf731"

RPROVIDES:${PN} += "baloo-tools baloo5-tools baloo5-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Baloo.so.5()(64bit) libKF5BalooEngine.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5FileMetaData.so.3()(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
