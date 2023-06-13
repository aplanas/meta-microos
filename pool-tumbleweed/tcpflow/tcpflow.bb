SUMMARY = "Program for capturing and collecting TCP streams"
DESCRIPTION = "tcpflow is a program that captures data transmitted as part of TCP connections \
(flows), and stores the data in a way that is convenient for protocol \
analysis and debugging. Each TCP flow is stored in its own file. Thus, the \
typical TCP flow will be stored in two files, one for each direction. \
tcpflow can also process stored 'tcpdump' packet flows."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.1"

RPM_NAME = "tcpflow-1.6.1-2.9.aarch64.rpm"
RPM_HASH = "7531885a9daa2f4ea373fae28ba2835b43e3a46c415ee8448b569b5eb2d63dcefbf88c8a720b7f693d412d48e6eb5915311981064195624ae939a939c84f68c6"

RPROVIDES:${PN} += "tcpflow \
tcpflow(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libpcap.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit)"

inherit rpm
