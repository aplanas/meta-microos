SUMMARY = "Development files for libxcfun"
DESCRIPTION = "The xcfun-devel package contains libraries and header files for \
developing applications that use libxcfun."
LICENSE = "MPL-2.0"

PV = "2.1.1"

RPM_NAME = "xcfun-devel-2.1.1-1.10.aarch64.rpm"
RPM_HASH = "f4b7a06e1173385c205c8296d3a9f49f92af3f2a047f91a9bdc6fe80911572737b5a17867b603f5e05b1d872b0942befb286b94fe89f98e249e4116aed913319"

RPROVIDES:${PN} += "cmake(XCFun) \
xcfun-devel \
xcfun-devel(aarch-64)"
RDEPENDS:${PN} += "libxcfun2"

inherit rpm
