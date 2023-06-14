SUMMARY = "Belarusian (беларуская мова) Dictionary for Aspell"
DESCRIPTION = "A Belarusian (беларуская мова) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.01"

RPM_NAME = "aspell-be-0.01-2.14.aarch64.rpm"
RPM_HASH = "35e714c3bb5e359779646b3f5670b898dc2cf23c3aa4eeb3f4954489ba63519ede63d900f663e09b0656603635320dfeea90dd50eaf204b12c08fb12aaaaa4a2"

RPROVIDES:${PN} += "aspell-be \
locale-aspell-be"

RDEPENDS:${PN} += ""

inherit rpm
