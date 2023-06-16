SUMMARY = "YaST2 - Core Libraries"
DESCRIPTION = "This package contains the scanner, parser, and interpreter runtime \
library for the YCP scripting language used in YaST2."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-core-4.6.0-1.3.aarch64.rpm"
RPM_HASH = "bfe507b23eaefb2b06a7cb336aa87fbdeb19e4adcd12cb297666cf7a47edb4fd8917610fb9fe1c9aa2d544e47d0faab87a4bec1dac3bd5e5a4e30b6efbe13c3c"

RPROVIDES:${PN} += "libpy2ag-anyagent.so.2 \
libpy2ag-dummy.so.2 \
libpy2ag-ini.so.2 \
libpy2ag-modules.so.2 \
libpy2ag-process.so.2 \
libpy2ag-resolver.so.2 \
libpy2ag-system.so.2 \
libpy2scr.so.2 \
libpy2serial.so.2 \
libpy2wfm.so.2 \
libscr.so.3 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
libycpvalues.so.6 \
perl-YaST--SCRAgent \
perl-ycp \
yast2-core"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
perl"

inherit rpm
