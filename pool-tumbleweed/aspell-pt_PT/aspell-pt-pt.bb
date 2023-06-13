SUMMARY = "Portuguese (Português) Dictionary for Aspell"
DESCRIPTION = "A Portuguese (Português) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "20190329"

RPM_NAME = "aspell-pt_PT-20190329-2.14.aarch64.rpm"
RPM_HASH = "27d44dbdec51ef98d4b00999cedd863af7c64bc15e789e47731ea0cace80cd56c0f2dd98479699e2e8b0c3ce078ecc00bd16c8a7baf31d292ec53714d41a1bdf"

RPROVIDES:${PN} += "aspell-pt_PT \
aspell-pt_PT(aarch-64) \
locale(aspell:pt)"

RDEPENDS:${PN} += ""

inherit rpm
