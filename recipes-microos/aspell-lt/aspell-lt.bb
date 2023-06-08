SUMMARY = "Lithuanian (lietuvių) Dictionary for Aspell"
DESCRIPTION = "A Lithuanian ((lietuvių) dictionary for the aspell spell checker."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "aspell-lt-1.2.1-2.14.aarch64.rpm"
RPM_HASH = "d230814c60630cb3378278a1a54476726c0461cf736fc6194758da5133ec51d9fccab9132568d1634c48c806a8210877be80399fec2914ec8ca05f3368451ba9"

RPROVIDES:${PN} += "aspell-lt aspell-lt(aarch-64) locale(aspell:lt)"
RDEPENDS:${PN} += ""

inherit rpm
