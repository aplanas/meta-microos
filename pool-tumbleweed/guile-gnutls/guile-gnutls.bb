SUMMARY = "Guile bindings to GnuTLS"
DESCRIPTION = "GnuTLS wrappers for GNU Guile, a dialect of Scheme."
LICENSE = "LGPL-2.1-or-later"

PV = "3.7.12"

RPM_NAME = "guile-gnutls-3.7.12-1.1.aarch64.rpm"
RPM_HASH = "7006887f8afeb6f08223d8834b35d29f30cbbefb3fc834fcd20a64ff53c51b6cd9a1ec5b861657e757d7cbe17125839234f4250893efbd7ac9b616ce264058ce"

RPROVIDES:${PN} += "gnutls-guile \
guile-gnutls"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libguile-3.0.so.1"

inherit rpm
