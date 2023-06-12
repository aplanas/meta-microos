SUMMARY = "Estonian (eesti) Dictionary for Aspell"
DESCRIPTION = "An Estonian (eesti) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.21"

RPM_NAME = "aspell-et-0.1.21-2.14.aarch64.rpm"
RPM_HASH = "32f47bc288d702a1caa2aeb3d9b2d8a2619db950f4592d67692a0c5832d1ec239c9fb7808da5d7248416bd44f64c5ef2632ec1755f5cfff8ae5ac3b5c4df0e3f"

RPROVIDES:${PN} += "aspell-et \
aspell-et(aarch-64) \
locale(aspell:et)"
RDEPENDS:${PN} += ""

inherit rpm
