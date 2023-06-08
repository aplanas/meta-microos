SUMMARY = "Package providing R-parallel"
DESCRIPTION = "This package provides R-parallel, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-parallel-4.3.0-45.1.aarch64.rpm"
RPM_HASH = "2157ee7e6a24b4cb2ca32d09c86e86095e9961e77fe7fc03d6b1b2759e55d7f93ddd35f61c9388156fb4ad7903931479d514879d156cb1da63675794672b511b"

RPROVIDES:${PN} += "R-parallel R-parallel(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
