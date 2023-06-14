SUMMARY = "Norwegian Nynorsk (Norsk nynorsk) Dictionary for Aspell"
DESCRIPTION = "A Norwegian Nynorsk (Norsk nynorsk) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.11"

RPM_NAME = "aspell-nn-0.50.11-2.14.aarch64.rpm"
RPM_HASH = "6c65cb782b931f17251ea119071c0fbb07e901ff0773dfa77e49daf4a0c112f91cc0785125964c2bf569da6947c06a929215cebcafb9d8c5b701bcce0d0c74e5"

RPROVIDES:${PN} += "aspell-nn \
locale-aspell-nn"

RDEPENDS:${PN} += ""

inherit rpm
