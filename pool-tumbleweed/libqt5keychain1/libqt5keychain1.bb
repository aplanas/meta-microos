SUMMARY = "A password store library"
DESCRIPTION = "qtkeychain can be used to store passwords."
LICENSE = "BSD-2-Clause"

PV = "0.13.2"

RPM_NAME = "libqt5keychain1-0.13.2-4.1.aarch64.rpm"
RPM_HASH = "a53d57c1fed57c3eddbe470667015381522371aff9cbe3a2fa6cc63c0585708e9f827c90699d412dc5b9de2b398b1be5a16dd8bc6cd05af20f9889f0055a2338"

RPROVIDES:${PN} += "libqt5keychain.so.1()(64bit) \
libqt5keychain1 \
libqt5keychain1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
