SUMMARY = "Library for interaction with OAuth-powered network services"
DESCRIPTION = "QOAuth supports interaction with OAuth-powered network services, \
in the style of Qt libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.0"

RPM_NAME = "libqoauth2-2.0.0-3.22.aarch64.rpm"
RPM_HASH = "d283d2d5883aad587e21a90aa10bc69c5342c936f94b6dbc153d5a063509d0868e639120dcbdcc4c2a4b1203fc1eac1e5a56ffefd62ba89c8afb2f712fea9710"

RPROVIDES:${PN} += "libqoauth.so.2()(64bit) \
libqoauth2 \
libqoauth2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libqca-qt5.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
