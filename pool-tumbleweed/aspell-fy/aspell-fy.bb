SUMMARY = "Frisian (Frysk) Dictionary for Aspell"
DESCRIPTION = "A Frisian (Frysk) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.12"

RPM_NAME = "aspell-fy-0.12-2.14.aarch64.rpm"
RPM_HASH = "ef14dc7e990cad34a5731e75b76065c3547c309af9abbc9d2582e6556e26d5fd487f514d4e3e80f83ce7a8e2e9b7a77aa279bc205360ded8c0e5b00e53ba0e4b"

RPROVIDES:${PN} += "aspell-fy \
locale-aspell-fy"

RDEPENDS:${PN} += ""

inherit rpm
