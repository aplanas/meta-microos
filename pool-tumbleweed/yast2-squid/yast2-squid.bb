SUMMARY = "Configuration of squid"
DESCRIPTION = "Configuration of squid"
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-squid-4.6.0-1.3.aarch64.rpm"
RPM_HASH = "c08cdb85ef9d5a4e8fdb6dd4382388bdcdf3f0be1dce3b6fb5c6f6861e4ab26fc4cfd6a848567aa7e687562594019f3c62243ce90ee79dc590b18187f996dcda"

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
