SUMMARY = "YaST2 - Core Libraries"
DESCRIPTION = "This package contains the scanner, parser, and interpreter runtime \
library for the YCP scripting language used in YaST2."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-core-4.6.0-1.3.aarch64.rpm"
RPM_HASH = "bfe507b23eaefb2b06a7cb336aa87fbdeb19e4adcd12cb297666cf7a47edb4fd8917610fb9fe1c9aa2d544e47d0faab87a4bec1dac3bd5e5a4e30b6efbe13c3c"

RPROVIDES:${PN} += "libpy2ag_anyagent.so.2()(64bit) \
libpy2ag_dummy.so.2()(64bit) \
libpy2ag_ini.so.2()(64bit) \
libpy2ag_modules.so.2()(64bit) \
libpy2ag_process.so.2()(64bit) \
libpy2ag_resolver.so.2()(64bit) \
libpy2ag_system.so.2()(64bit) \
libpy2scr.so.2()(64bit) \
libpy2serial.so.2()(64bit) \
libpy2wfm.so.2()(64bit) \
libscr.so.3()(64bit) \
liby2.so.4()(64bit) \
liby2util.so.5()(64bit) \
libycp.so.5()(64bit) \
libycpvalues.so.6()(64bit) \
perl(YaST::SCRAgent) \
perl(ycp) \
yast2-core \
yast2-core(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/sbin/ldconfig \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
perl"

inherit rpm
