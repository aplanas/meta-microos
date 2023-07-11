SUMMARY = "Documentation for rttr"
DESCRIPTION = "API Documentation for rttr"
LICENSE = "MIT"

PV = "0.9.6"

RPM_NAME = "rttr-devel-doc-0.9.6-4.17.aarch64.rpm"
RPM_HASH = "506bb32c6bb56a27a956eb99d9d7a3f88594df18d35e9b4dc07fc8859939a0a0f6530f2eba5dacdef12f95ee8c4a5a7e453ead9f13d76e8b326c04b0d58c3a59"

RPROVIDES:${PN} += "rttr-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
