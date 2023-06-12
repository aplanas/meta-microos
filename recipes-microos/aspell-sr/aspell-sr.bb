SUMMARY = "Serbian (српски) Dictionary for Aspell"
DESCRIPTION = "A Serbian (српски) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "0.02"

RPM_NAME = "aspell-sr-0.02-2.14.aarch64.rpm"
RPM_HASH = "24dbb6a8df5dc7631c1bf3de9a08bde26374ccf841d91a0b6aeb9b3df43217bc5ef5c0189991c4c5f17ffc1729900adfe13c3f5a78c6d08340e90cca31a6f221"

RPROVIDES:${PN} += "aspell-sr \
aspell-sr(aarch-64) \
locale(aspell:sr)"
RDEPENDS:${PN} += ""

inherit rpm
