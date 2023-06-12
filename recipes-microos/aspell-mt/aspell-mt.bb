SUMMARY = "Maltese (Malti) Dictionary for Aspell"
DESCRIPTION = "A Maltese (Malti) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "0.50"

RPM_NAME = "aspell-mt-0.50-2.14.aarch64.rpm"
RPM_HASH = "b418c87e0b43f6498d47648e742440bd087ac12e9400b4c5d0aa6467e7d2fff9af4c611d411128a6b93b2abc7e2aca2be3c3cc2dc35b9bd1228cb12bc3a45c04"

RPROVIDES:${PN} += "aspell-mt \
aspell-mt(aarch-64) \
locale(aspell:mt)"
RDEPENDS:${PN} += ""

inherit rpm
