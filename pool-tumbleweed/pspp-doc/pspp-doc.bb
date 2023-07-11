SUMMARY = "Manual for PSPP"
DESCRIPTION = "PSPP is a program for statistical analysis of sampled data. It \
is a free replacement for the proprietary program SPSS. \
 \
This subpackage contains documentation for PSPP."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "pspp-doc-1.4.1-3.14.aarch64.rpm"
RPM_HASH = "390aceab6ec801f5879483fe21a74987152e120717a1c3df6f94509597ed8594ed09e08c98136758bf0267652ddafd6d365db0f35dbd912f3012aaa24e5ae193"

RPROVIDES:${PN} += "pspp-doc"

RDEPENDS:${PN} += ""

inherit rpm
