SUMMARY = "Documentation for CKermit"
DESCRIPTION = "This package contains the documentation and manual pages for ckermit"
LICENSE = "BSD-3-Clause"

PV = "9.0.302"

RPM_NAME = "ckermit-doc-9.0.302-15.1.noarch.rpm"
RPM_HASH = "35b7dca0902f6c7dcd49af75f072ef034a7d8cfe4952b43186455dfc22ef2f4ef10f60b5bfcdaa092bed0e88164fcc81c00f6a322c54a7cc3a80f04096aabe92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ckermit-doc"

RDEPENDS:${PN} += ""

inherit rpm
