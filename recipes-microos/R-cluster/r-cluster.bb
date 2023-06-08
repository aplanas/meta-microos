SUMMARY = "Package provides recommended R-cluster"
DESCRIPTION = "This packages provides R-cluster, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.1.4"

RPM_NAME = "R-cluster-2.1.4-45.1.aarch64.rpm"
RPM_HASH = "910fbc72eb58ab9b7465d4242c3971206a54edd72d2d0e0fe24dc6521fef2979d0caee73e2e9fb249d451f4a4128cdebae60d50e9f51dfcd7ac9dc5c91931880"

RPROVIDES:${PN} += "R-cluster R-cluster(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
