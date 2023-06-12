SUMMARY = "PostgreSQL plugin for tntdb"
DESCRIPTION = "PostgreSQL plugin for tntdb abstraction library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "tntdb-postgresql-1.4-1.12.aarch64.rpm"
RPM_HASH = "8d14f66ccc4041f0de4f8c245593edea8dc8cd3f9436428857455ee8011d44d349fe21ca0aaed1ccd5c6bc3fd6b42b8e0050a901a89d25cbdd67c69bd3ca1f38"

RPROVIDES:${PN} += "tntdb-postgresql \
tntdb-postgresql(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libcxxtools.so.10()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libpq.so.5()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.7)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtntdb.so.5()(64bit)"

inherit rpm