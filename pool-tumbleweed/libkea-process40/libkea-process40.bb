SUMMARY = "Kea DHCP process abstraction library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-process40-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "3fa6d913ed803d22d8c7176d2243d63895710bd48a71879311b9013486054c5f41eec3da1936e01c1a32770047e9cf077948b9c65b7151117e6c55f35f62bc9f"

RPROVIDES:${PN} += "libkea-process.so.40()(64bit) \
libkea-process40 \
libkea-process40(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libkea-asiolink.so.40()(64bit) \
libkea-cc.so.39()(64bit) \
libkea-database.so.35()(64bit) \
libkea-exceptions.so.13()(64bit) \
libkea-hooks.so.57()(64bit) \
libkea-log.so.35()(64bit) \
libkea-util.so.52()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
