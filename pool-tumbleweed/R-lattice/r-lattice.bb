SUMMARY = "Package provides recommended R-lattice"
DESCRIPTION = "This packages provides R-lattice, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.21.8"

RPM_NAME = "R-lattice-0.21.8-45.2.aarch64.rpm"
RPM_HASH = "4474e08995c03610467009a14c11d2251a00dbc4c56e5cfd73ac8a9fb81c0dfb1cffed6598bc472603dec63dc433547d1b57076312fd8a7cdc9904778d3bda90"

RPROVIDES:${PN} += "R-lattice \
R-lattice(aarch-64)"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libR.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
