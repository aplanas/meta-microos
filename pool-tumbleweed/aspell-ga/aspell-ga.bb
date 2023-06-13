SUMMARY = "Irish (Gaeilge) Dictionary for Aspell"
DESCRIPTION = "An Irish (Gaeilge) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.0"

RPM_NAME = "aspell-ga-4.5.0-2.14.aarch64.rpm"
RPM_HASH = "25fc6e1cb609593de81dcb1f7f7a390d5125f4908787f978d7afaf7860601dd0bf9d11cd59dd516ea6cc13d1a76a76f75e313417883a100e9a88a62dc2cdaf16"

RPROVIDES:${PN} += "aspell-ga \
aspell-ga(aarch-64) \
locale(aspell:ga)"

RDEPENDS:${PN} += ""

inherit rpm
