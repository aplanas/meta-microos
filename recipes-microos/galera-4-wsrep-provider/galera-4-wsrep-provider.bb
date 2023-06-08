SUMMARY = "Galera support library"
DESCRIPTION = "Galera is a fast synchronous multimaster wsrep provider (replication engine) \
for transactional databases and similar applications. For more information \
about wsrep API see http://launchpad.net/wsrep. For a description of Galera \
replication engine see http://www.codership.com. \
 \
This package provides the libgalera_smm library."
LICENSE = "GPL-2.0-only"

PV = "26.4.14"

RPM_NAME = "galera-4-wsrep-provider-26.4.14-1.1.aarch64.rpm"
RPM_HASH = "3f39400ad08fe5c88921e315f1a422aaec3aa70210bbe1b745ebd45fa8faa5d171d0b9e21b118ed258c0399bdba3dc8c88c515706968a61f9611bdf149a05106"

RPROVIDES:${PN} += "config(galera-4-wsrep-provider) galera-4-wsrep-provider galera-4-wsrep-provider(aarch-64) libgalera_smm.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) mariadb-galera"

inherit rpm
