SUMMARY = "Ukrainian (українська) Dictionary for Aspell"
DESCRIPTION = "An Ukrainian (українська) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "aspell-uk-1.4.0-2.14.aarch64.rpm"
RPM_HASH = "08bbb16bcf0881dbf8a45845154a3412244fc72952f4875963016d16c1e1c8a9c7d1541f61f250ac66e31d70cc1aa96bc2cac1dca235683bdd5da5f8addb0458"

RPROVIDES:${PN} += "aspell-uk \
aspell-uk(aarch-64) \
locale(aspell:uk)"
RDEPENDS:${PN} += ""

inherit rpm
