SUMMARY = "Kea DHCP logging system library"
DESCRIPTION = "This library contains the Kea logging system, which is based on the \
log4J logging system common in Java development, and includes the \
following ideas: a set of severity levels; a hierarchy of logging \
sources; separation of message use from message text."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-log35-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "cb10c6cedf8098730b81ae61ca0876e0323347d94a823715b38149a0ef924159bffec120bd36583a54f55d588b8523badf06290cbba83937ae88a770a412feb3"

RPROVIDES:${PN} += "libkea-log.so.35()(64bit) \
libkea-log35 \
libkea-log35(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libkea-exceptions.so.13()(64bit) \
libkea-util.so.52()(64bit) \
liblog4cplus-2.0.so.3()(64bit) \
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
