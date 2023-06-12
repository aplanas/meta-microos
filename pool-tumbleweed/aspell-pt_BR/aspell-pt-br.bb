SUMMARY = "Brazilian Portuguese (Português brasileira) Dictionary for Aspell"
DESCRIPTION = "A Brazilian Portuguese (Português brasileira) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "20131030.12.0"

RPM_NAME = "aspell-pt_BR-20131030.12.0-2.14.aarch64.rpm"
RPM_HASH = "8cc46bb9e83e5e6dd55cdacb25de627ed514b63424c2f5abc7ddc13eff181f5f65f229e0f364d26973ca3f27a1d602dfe07d39dd44e8a7994f81c3ec75c2eb33"

RPROVIDES:${PN} += "aspell-pt_BR \
aspell-pt_BR(aarch-64) \
locale(aspell:pt_BR)"
RDEPENDS:${PN} += ""

inherit rpm
