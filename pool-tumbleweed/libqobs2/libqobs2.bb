SUMMARY = "A Qt-based OBS library"
DESCRIPTION = "A library for interacting with the Open Build Service (OBS)."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "libqobs2-2.1.0-2.9.aarch64.rpm"
RPM_HASH = "c382894f7644dbdd3a66e0745edd4fccfb2554514c8a0e8024e35c0a70457e528e91123ef7ef1f3e2d7e84b3302fe29ee32568d27c9f7afdec63c62ea763e558"

RPROVIDES:${PN} += "libqobs.so.2()(64bit) \
libqobs2 \
libqobs2(aarch-64)"

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
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
