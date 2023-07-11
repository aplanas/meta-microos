SUMMARY = "YaST2 - Core Libraries"
DESCRIPTION = "This package contains the scanner, parser, and interpreter runtime \
library for the YCP scripting language used in YaST2."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-core-4.6.0-1.4.aarch64.rpm"
RPM_HASH = "ca5ef94a671f95b71dc1cae59926e22fb85b06932fe634c030d54189905108609b639cdaeb07b4f481cb49c82af39985dc9667336967d3f21787c6dbe86d679b"

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
