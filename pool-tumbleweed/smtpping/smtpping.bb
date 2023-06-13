SUMMARY = "A tool for measuring SMTP server delay, delay variation and throughput"
DESCRIPTION = "A tool for measuring SMTP server delay, delay variation and throughput."
LICENSE = "GPL-2.0-only"

PV = "1.1.4"

RPM_NAME = "smtpping-1.1.4-1.7.aarch64.rpm"
RPM_HASH = "098662291925298275d1cc33fa71d8a9165e84d6a592610b10bb09a5853c24c9d49a7de74f8fbdf2a4e8217f785895b9ebde598cfc0b8bc909b194bdbc69c49c"

RPROVIDES:${PN} += "smtpping \
smtpping(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
