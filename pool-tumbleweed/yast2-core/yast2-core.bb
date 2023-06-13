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
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
perl"

inherit rpm
