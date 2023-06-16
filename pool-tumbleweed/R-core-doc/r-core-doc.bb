SUMMARY = "Package provides all documentation of R base. PDFs, man pages, info pages"
DESCRIPTION = "This packages provides all documentation of R base. PDFs, man pages, info pages"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-core-doc-4.3.0-45.2.aarch64.rpm"
RPM_HASH = "a0f27a41570796a1ea9d02e0aa6367f0fb2bb5eb9efcf9ad4311082b5d6c7560f8565a1da179bc9be31d8bd6354d147659dd38a18863ee05fa91f74cd3bed96e"

RPROVIDES:${PN} += "R-core-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
