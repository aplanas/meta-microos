SUMMARY = "Package providing R-tcltk"
DESCRIPTION = "This package provides R-tcltk, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "R-tcltk-4.3.1-46.1.aarch64.rpm"
RPM_HASH = "c81b2baaecd5c542ecbf3fe97c9e5898eb4c08713c824f4ce7d5ea4a190ea1c5c406d5ca2858ed25e2be11ddfb8ad6e6437054c67d0d9c3a11e583ee16a03558"

RPROVIDES:${PN} += "R-tcltk"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so"

inherit rpm
