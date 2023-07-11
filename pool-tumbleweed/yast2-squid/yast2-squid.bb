SUMMARY = "Configuration of squid"
DESCRIPTION = "Configuration of squid"
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-squid-4.6.0-1.4.aarch64.rpm"
RPM_HASH = "64cf460645a07655d78f8a1f0e36a9653f0b7a6cfda47df2ad5993e92b0075bdcab8d055454d0ac77631ac60a3d9f844cc032fd495b54a1744c25e1448d22317"

RPROVIDES:${PN} += "libpy2ag-squid.so.2 \
yast2-squid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libscr.so.3 \
libstdc++.so.6 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
libycpvalues.so.6 \
yast2 \
yast2-ruby-bindings"

inherit rpm
