SUMMARY = "Italian (italiano) Dictionary for Aspell"
DESCRIPTION = "An Italian (italiano) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "2.2_20050523"

RPM_NAME = "aspell-it-2.2_20050523-2.14.aarch64.rpm"
RPM_HASH = "73623ada26f24e08b346f90a6c95e891f7d7d46131bb0cb9379ef1e7986e0f2e6b6a1f2fdc4233490b9bf166cc74747db66829f214fa6ca67a3efbb185929262"

RPROVIDES:${PN} += "aspell-it \
aspell-it(aarch-64) \
locale(aspell:it)"
RDEPENDS:${PN} += ""

inherit rpm
