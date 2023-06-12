SUMMARY = "Breton (brezhoneg) Dictionary for Aspell"
DESCRIPTION = "A Breton (brezhoneg) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.2"

RPM_NAME = "aspell-br-0.50.2-2.14.aarch64.rpm"
RPM_HASH = "73d24ff51e17487e59be4593fce061630926c53cc323a29e0123e4b8e4e3e1a40d095c7a8276c1cee2d4a24fa08abe2b94791b5c981ade7205459673dc43514c"

RPROVIDES:${PN} += "aspell-br \
aspell-br(aarch-64) \
locale(aspell:br)"
RDEPENDS:${PN} += ""

inherit rpm
