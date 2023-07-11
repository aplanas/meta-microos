SUMMARY = "Freetype2 Utilities and Demo Programs"
DESCRIPTION = "Freetype2 utilities and demo programs."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ft2demos-2.13.0-4.2.aarch64.rpm"
RPM_HASH = "33954e32aea2e181e8cb4b73ac89b2dde763df68c83bf491693eed1703c13da57ceb8320f89350ccb57b3e2844fec457e5ada66ec97ad9327b066b0e899bf148"

RPROVIDES:${PN} += "ft2demos"

RDEPENDS:${PN} += "ftbench \
ftdiff \
ftdump \
ftgamma \
ftgrid \
ftinspect \
ftlint \
ftmulti \
ftstring \
ftvalid \
ftview"

inherit rpm
