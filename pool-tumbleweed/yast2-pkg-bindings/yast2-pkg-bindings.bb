SUMMARY = "YaST2 - Package Manager Access"
DESCRIPTION = "This package contains a name space for accessing the package manager \
library in YaST2."
LICENSE = "GPL-2.0-only"

PV = "4.6.2"

RPM_NAME = "yast2-pkg-bindings-4.6.2-1.2.aarch64.rpm"
RPM_HASH = "b43b253f0fedc75bbb43fedab9b23b4272075a915730e96e46092ba2cfc26c10c642d1a4035e96d8dff9507dba79ef5534ead00dde07c6654430a34d1c067a04"

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
