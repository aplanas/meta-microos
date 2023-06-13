SUMMARY = "Wt::Dbo ORM library and Sqlite3 back-end"
DESCRIPTION = "This package contains the Wt::Dbo Object-Relational Mapping library \
and Sqlite3 back-end of it."
LICENSE = "GPL-2.0-only"

PV = "4.8.1"

RPM_NAME = "libwtdbo4_8_1-4.8.1-3.6.aarch64.rpm"
RPM_HASH = "f1ed4d7be69d6194454d1b5a0e3636d70f87103097ccfa8be443510c68fb75573c111490cbeb873c642dd7d580f338ea580c39c8404fd2b5f8015d7427962d29"

RPROVIDES:${PN} += "libwtdbo.so.4.8.1()(64bit) \
libwtdbo4_8_1 \
libwtdbo4_8_1(aarch-64) \
libwtdbosqlite3.so.4.8.1()(64bit) \
wt-dbo"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
