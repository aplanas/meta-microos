SUMMARY = "The libpamtest API documentation"
DESCRIPTION = "Documentation for libpamtest development."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.4"

RPM_NAME = "libpamtest-devel-doc-1.1.4-2.4.aarch64.rpm"
RPM_HASH = "fb5a1cd016ff7a017138453c01a55b378c36627506f4b4f052495ad53dd3d0604f319bf53ec7be02cc12b98264156c7b68505cfb0140cf48a4a0b1a7d4280605"

RPROVIDES:${PN} += "libpamtest-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
