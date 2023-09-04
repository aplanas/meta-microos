SUMMARY = "Base System"
DESCRIPTION = "The 32bit pattern complementing base."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-base-32bit-20200505-42.1.aarch64.rpm"
RPM_HASH = "de94aac89bf25a425e708b714c7a80c73072ebabb71f948187e1febf78e2fc976c9552b007999a6084f6990f11c9530b22d0b65943ca681502a154e8e45587db"

RPROVIDES:${PN} += "pattern- \
patterns-base-base-32bit"

RDEPENDS:${PN} += ""

inherit rpm
