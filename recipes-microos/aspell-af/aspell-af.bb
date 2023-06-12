SUMMARY = "Afrikaans Dictionary for Aspell"
DESCRIPTION = "An Afrikaans dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "0.50.0"

RPM_NAME = "aspell-af-0.50.0-2.14.aarch64.rpm"
RPM_HASH = "ee2cee8efcbfa516ff6d6e5ae050051e66cb8aaf0222d1e2194ea98a7b5afc12a8939647cf33f14ff59a5e92ed4fdb0c111988d59f20113d45e592d9bfdf750c"

RPROVIDES:${PN} += "aspell-af \
aspell-af(aarch-64) \
locale(aspell:af)"
RDEPENDS:${PN} += ""

inherit rpm
