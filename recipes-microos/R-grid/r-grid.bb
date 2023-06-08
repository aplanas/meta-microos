SUMMARY = "Package providing R-grid graphics in R-grid"
DESCRIPTION = "This package provides R-grid, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-grid-4.3.0-45.1.aarch64.rpm"
RPM_HASH = "88758e3ed45649e670a649d6de8761d58f7613b4a95544b81bfa66ecf47fe6c2607c22b91953e9aef688d9179e63d01db9f127f480b04184216855829d20c977"

RPROVIDES:${PN} += "R-grid R-grid(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
