SUMMARY = "YaST2 - Package Manager Access"
DESCRIPTION = "This package contains a name space for accessing the package manager \
library in YaST2."
LICENSE = "GPL-2.0-only"

PV = "4.6.2"

RPM_NAME = "yast2-pkg-bindings-4.6.2-1.1.aarch64.rpm"
RPM_HASH = "b83e5d945c8af4c4e4ebbb207e5e6740566cc64d75539e0b5ac25e4004b51fcf4a3658d59617c1c7fc8833dcf442f0fc546a7cbe0a24c59754b24f8969fd0259"

RPROVIDES:${PN} += "libpy2Pkg.so.2()(64bit) \
yast2-pkg-bindings \
yast2-pkg-bindings(aarch-64)"

RDEPENDS:${PN} += "grep \
iproute2 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
liby2.so.4()(64bit) \
liby2util.so.5()(64bit) \
libycp.so.5()(64bit) \
libycpvalues.so.6()(64bit) \
libzypp.so.1722()(64bit) \
libzypp.so.1722(ZYPP_plain)(64bit)"

inherit rpm
