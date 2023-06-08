SUMMARY = "Package provides all documentation of R base. PDFs, man pages, info pages"
DESCRIPTION = "This packages provides all documentation of R base. PDFs, man pages, info pages"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-core-doc-4.3.0-45.1.aarch64.rpm"
RPM_HASH = "92812af21572a58322c49c58a26f923c0ff477fb8bb38f729273631bc67b49e02e6f02c1ce1479b496868e28a008f3e55919568a5b3ae10231a505e827a5bc2e"

RPROVIDES:${PN} += "R-core-doc R-core-doc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
