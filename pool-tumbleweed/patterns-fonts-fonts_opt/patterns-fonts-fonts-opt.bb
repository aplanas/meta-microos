SUMMARY = "Fonts"
DESCRIPTION = "Base fonts and font configuration."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-fonts-fonts_opt-20170319-10.1.aarch64.rpm"
RPM_HASH = "e2a01e2063df813de2a92b4b39e0872281f43ab5eaed8b237bf29367c3a02ca945d9482a32bbf5fb296280fb270b93a888f6a8ba873a432814579fdf79fc08c2"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-fonts-fonts-opt"

RDEPENDS:${PN} += ""

inherit rpm
