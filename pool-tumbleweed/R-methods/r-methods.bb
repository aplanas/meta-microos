SUMMARY = "Package providing R-methods"
DESCRIPTION = "This package provides R-methods, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-methods-4.3.0-45.2.aarch64.rpm"
RPM_HASH = "4465429a17a26be951ecc434592fe4982c486e1b138f8ddbfc1e656d47246483e42bd8c7f0c41180d31333c9540565ac355e640fb358660d6fff0e16dd3e0fa2"

RPROVIDES:${PN} += "R-methods \
R-methods(aarch-64)"
RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libR.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
