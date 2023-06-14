SUMMARY = "YaST2 - Package Manager Access"
DESCRIPTION = "This package contains a name space for accessing the package manager \
library in YaST2."
LICENSE = "GPL-2.0-only"

PV = "4.6.2"

RPM_NAME = "yast2-pkg-bindings-4.6.2-1.1.aarch64.rpm"
RPM_HASH = "b83e5d945c8af4c4e4ebbb207e5e6740566cc64d75539e0b5ac25e4004b51fcf4a3658d59617c1c7fc8833dcf442f0fc546a7cbe0a24c59754b24f8969fd0259"

RPROVIDES:${PN} += "libpy2Pkg.so.2 \
yast2-pkg-bindings"

RDEPENDS:${PN} += "grep \
iproute2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
libycpvalues.so.6 \
libzypp.so.1722"

inherit rpm
