SUMMARY = "Czech (čeština) Dictionary for Aspell"
DESCRIPTION = "A Czech (český) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.60.0.20040614"

RPM_NAME = "aspell-cs-0.60.0.20040614-2.14.aarch64.rpm"
RPM_HASH = "63ddefb9e7689604e9f357d98f91641fe86cf042829c99c4b71ec4a6660093f252733944f784fc538f84c221ba3ca60f916125884e3c50bff6702dbb640d542c"

RPROVIDES:${PN} += "aspell-cs aspell-cs(aarch-64) locale(aspell:cs)"
RDEPENDS:${PN} += ""

inherit rpm
