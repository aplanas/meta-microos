SUMMARY = "Package provides recommended R-lattice"
DESCRIPTION = "This packages provides R-lattice, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.21.8"

RPM_NAME = "R-lattice-0.21.8-46.1.aarch64.rpm"
RPM_HASH = "c100d70445966c5b1d0b1faad6189a3b26503f99c54f74e981c853c7cff703da0e0e8b4c690deb1b7afd168f24d0bb5e77cc179de2c1c456ea71d1dc5ca69822"

RPROVIDES:${PN} += "R-lattice"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
