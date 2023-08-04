SUMMARY = "Documentation for Kanidm Administration"
DESCRIPTION = "Documentation for using and configuring Kanidm."
LICENSE = "MPL-2.0"

PV = "1.1.0~beta13~git2.5d1e2f9"

RPM_NAME = "kanidm-docs-1.1.0~beta13~git2.5d1e2f9-1.1.aarch64.rpm"
RPM_HASH = "2173e8b868f59a61f530e4bf6ab78c9df62203ebe6b863d89eb07064f7b9cf8d441ceb255ed86017fc5c17b6d8c67fb2e00d89485247edc7398382d19068e4b4"

RPROVIDES:${PN} += "kanidm-docs"

RDEPENDS:${PN} += ""

inherit rpm
