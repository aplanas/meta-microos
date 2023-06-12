SUMMARY = "French (français) Dictionary for Aspell"
DESCRIPTION = "A French (français) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.3"

RPM_NAME = "aspell-fr-0.50.3-2.14.aarch64.rpm"
RPM_HASH = "fa06103a95568c9dd1cc763016227bf5c5aad29969c71eb3205612ce39ed5f5dac3ba7a912e4175efa3efbace1af2bc5b98cca78b8ffe05247f4667c374cada1"

RPROVIDES:${PN} += "aspell-fr \
aspell-fr(aarch-64) \
locale(aspell:fr)"
RDEPENDS:${PN} += ""

inherit rpm
