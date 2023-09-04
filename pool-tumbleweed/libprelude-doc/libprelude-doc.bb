SUMMARY = "Libprelude documentation"
DESCRIPTION = "Libprelude documentation files."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "libprelude-doc-5.2.0-2.17.aarch64.rpm"
RPM_HASH = "dde68447b3d7b4820e2a2e6785a8f666f1d1657e0d573bca99238760e65343588fe2db5e29b81abb6f9b8e2048a83faaa97cfb3594534a64dd7fd52d413a5a87"

RPROVIDES:${PN} += "libprelude-doc"

RDEPENDS:${PN} += ""

inherit rpm
