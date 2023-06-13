SUMMARY = "C compiler runtime library"
DESCRIPTION = "Libgcc is needed for dynamically linked C programs."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "13.1.1+git7364"

RPM_NAME = "libgcc_s1-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "971505a2082b623ef8b3da7a57b70d4e624622b73030c99129a165d03b5936a0491941403e13b9bae705e5449120fd876cea22b50ce8de8f86ac36cd3be880b7"

RPROVIDES:${PN} += "libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_11.0)(64bit) \
libgcc_s.so.1(GCC_13.0.0)(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_3.4)(64bit) \
libgcc_s.so.1(GCC_3.4.2)(64bit) \
libgcc_s.so.1(GCC_3.4.4)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgcc_s.so.1(GCC_4.3.0)(64bit) \
libgcc_s.so.1(GCC_4.5.0)(64bit) \
libgcc_s.so.1(GCC_4.7.0)(64bit) \
libgcc_s.so.1(GCC_7.0.0)(64bit) \
libgcc_s.so.1(GLIBC_2.0)(64bit) \
libgcc_s1 \
libgcc_s1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.35)(64bit)"

inherit rpm
