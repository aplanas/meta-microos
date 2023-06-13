SUMMARY = "Prelude Libraries"
DESCRIPTION = "The PreludeDB Library provides an abstraction layer upon the type and the \
format of the database used to store IDMEF alerts. It allows developers \
to use the Prelude IDMEF database easily and efficiently without \
worrying about SQL, and to access the database independently of the \
type/format of the database."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "libpreludedbcpp2-5.2.0-2.10.aarch64.rpm"
RPM_HASH = "de158bb9dcc01278d1699ed6625034057517ed3c0f79094948fb021f7a1040e6bd50fd1bb1f0208105a064a0ce8deeeb0d227f365340d7c23b41855cfc11dd88"

RPROVIDES:${PN} += "libpreludedbcpp.so.2()(64bit) \
libpreludedbcpp2 \
libpreludedbcpp2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libprelude.so.28()(64bit) \
libpreludecpp.so.12()(64bit) \
libpreludedb.so.7()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
