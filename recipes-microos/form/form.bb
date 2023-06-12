SUMMARY = "A Symbolic Manipulation System"
DESCRIPTION = "FORM is a Symbolic Manipulation System. It reads symbolic expressions from files \
and executes symbolic/algebraic transformations upon them. The answers are \
returned in a textual mathematical representation. As its landmark feature, the \
size of the considered expressions in FORM is only limited by the available \
disk space and not by the available RAM."
LICENSE = "GPL-3.0-or-later"

PV = "4.3.0"

RPM_NAME = "form-4.3.0-1.3.aarch64.rpm"
RPM_HASH = "587d4bda99f235ce153c8bdcbe11cbc567a4221dc952c8bbd8f47f8b7b30def36ac98556c21e2468ea4c7fb5d7947dca91a59237922d34936f2ab84d6c9d72bc"

RPROVIDES:${PN} += "form \
form(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpi.so.40()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit) \
openmpi4-libs"

inherit rpm
