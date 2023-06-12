SUMMARY = "Hebrew (עברית) Dictionary for Aspell"
DESCRIPTION = "A Hebrew (עברית) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "aspell-he-1.0.0-2.14.aarch64.rpm"
RPM_HASH = "ce7523a6a1435e64cedddb1610c49e88a2118a42a28e580322115ca9a80f22c7cb8e387dd8de32f978c3d0e92f38975846f19499c32e6f0bd2ae22637b9d2399"

RPROVIDES:${PN} += "aspell-he \
aspell-he(aarch-64) \
locale(aspell:he)"
RDEPENDS:${PN} += ""

inherit rpm
