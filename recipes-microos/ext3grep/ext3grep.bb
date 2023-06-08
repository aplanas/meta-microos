SUMMARY = "A tool to possibly recover deleted content on ext3 file systems"
DESCRIPTION = "A tool to investigate an ext3 file system for deleted content and possibly recover it. \
 \
Also see http://www.xs4all.nl/~carlo17/howto/undelete_ext3.html"
LICENSE = "GPL-2.0-only"

PV = "0.10.2"

RPM_NAME = "ext3grep-0.10.2-9.17.aarch64.rpm"
RPM_HASH = "b0046972df4104d0e6a2668c803815f4db2b2c4789ea3c448c05a4b62bd153995d68c89db136bd54ce242e20d6999630ef5231b285691b35769f736b8e9ec1b4"

RPROVIDES:${PN} += "ext3grep ext3grep(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
