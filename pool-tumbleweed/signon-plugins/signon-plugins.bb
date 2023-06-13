SUMMARY = "Plugins for the Single Sign On Framework"
DESCRIPTION = "This package contains the following plugins for the Single Sign On Framework: \
- Password plugin \
- Test plugin"
LICENSE = "LGPL-2.0-only"

PV = "8.60"

RPM_NAME = "signon-plugins-8.60-2.18.aarch64.rpm"
RPM_HASH = "dc43135a8351223f231038a3f434f40d3a95b150d02e850cbf0592b2df285755468204fad992d5d14652f2ce2737144ef684a3fd4dc4fcfff75855e0673e4420"

RPROVIDES:${PN} += "libexampleplugin.so()(64bit) \
libpasswordplugin.so()(64bit) \
libsignon-plugins.so.1()(64bit) \
libssotest2plugin.so()(64bit) \
libssotestplugin.so()(64bit) \
signon-plugins \
signon-plugins(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
signond"

inherit rpm
