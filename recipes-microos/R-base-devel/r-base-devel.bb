SUMMARY = "Metapackage, requires R-core-devel, R-core-libs"
DESCRIPTION = "Metapackage to keep the same user experience as before the split of \
the monolithic R-base-devel"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-base-devel-4.3.0-45.1.aarch64.rpm"
RPM_HASH = "8233e67d38477a9563d60f4932947e3cbd7646c4e181fdedccc7f6876222d9a3f6a7899e365a4f329b469140a22b827dd7702f06d73bfc84ae9b2d6e83c72ad3"

RPROVIDES:${PN} += "R-base-devel R-base-devel(aarch-64)"
RDEPENDS:${PN} += "R-core-devel R-core-libs"

inherit rpm
