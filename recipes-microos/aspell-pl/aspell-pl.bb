SUMMARY = "Polish (polszczyzna) Dictionary for Aspell"
DESCRIPTION = "A Polish (polszczyzna) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-only & LGPL-2.1-only & MPL-1.1 & CC-BY-SA-1.0"

PV = "0.60.2015.04.28"

RPM_NAME = "aspell-pl-0.60.2015.04.28-2.14.aarch64.rpm"
RPM_HASH = "d7d2ea6c0eb9b6725a9599928357b5627b8b2f2af85291776d4e039c7e7a56768e66efe09f9ac683df1b45984a2a122c0c02413f8d3751411c6e26d62ffcb222"

RPROVIDES:${PN} += "aspell-pl \
aspell-pl(aarch-64) \
locale(aspell:pl)"
RDEPENDS:${PN} += ""

inherit rpm
