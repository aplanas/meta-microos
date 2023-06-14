SUMMARY = "Galician-portuguese (galego-portugués) Dictionary for Aspell"
DESCRIPTION = "A Galician-portuguese (galego-portugués) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.0"

RPM_NAME = "aspell-agal-0.50.0-2.14.aarch64.rpm"
RPM_HASH = "a47b5cddc66b41c741e3fad6a22d4aa2f9cb8dacdb8c1eb80249c5ecf37f47b9ba2c39b48057ec057598088624eca7b2ea84ff55d8d419cb2d9ef9b2cb275da9"

RPROVIDES:${PN} += "aspell-agal \
locale-aspell-gl"

RDEPENDS:${PN} += ""

inherit rpm
