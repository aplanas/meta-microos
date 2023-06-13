SUMMARY = "Indonesian (Bahasa Indonesia) Dictionary for Aspell"
DESCRIPTION = "An Indonesian (Bahasa Indonesia) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "aspell-id-1.2-2.14.aarch64.rpm"
RPM_HASH = "66634468610d353136963923a16c49966417cfa6ee434af6ee36b39455274699a8adbb0950c13d07b97119a0e90568eeb7a1644b40f240503dcab457df992abd"

RPROVIDES:${PN} += "aspell-id \
aspell-id(aarch-64) \
locale(aspell:id)"

RDEPENDS:${PN} += ""

inherit rpm
