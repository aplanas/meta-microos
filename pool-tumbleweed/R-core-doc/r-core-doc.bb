SUMMARY = "Package provides all documentation of R base. PDFs, man pages, info pages"
DESCRIPTION = "This packages provides all documentation of R base. PDFs, man pages, info pages"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "R-core-doc-4.3.1-46.1.aarch64.rpm"
RPM_HASH = "728ec4bc90a300b114a61be69dd8946c579d5c1918809e9f296f47fceffcfd6b2abf5c86f8a00cd4fb18db0d7f693eb3c6d53c141cd6ee6f2e2773ff5453166b"

RPROVIDES:${PN} += "R-core-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
