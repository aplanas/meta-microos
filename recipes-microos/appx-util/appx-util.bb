SUMMARY = "Utility to create Microsoft .appx packages"
DESCRIPTION = "appx is a tool which creates and optionally signs \
Microsoft Windows APPX packages."
LICENSE = "BSD-3-Clause & MPL-2.0"

PV = "0.4"

RPM_NAME = "appx-util-0.4-2.4.aarch64.rpm"
RPM_HASH = "928ad3e20b72f939ad3fd45ed1262c19c9385d075be35d1463cb18c2fd1e012f66a5ff5e78cfc43c8509ca4f1e17a0061ccb8dcd01273220c70873f54558acab"

RPROVIDES:${PN} += "appx-util appx-util(aarch-64) fb-util-for-appx"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit)"

inherit rpm
