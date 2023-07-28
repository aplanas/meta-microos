SUMMARY = "Freetype2 Utilities and Demo Programs"
DESCRIPTION = "Freetype2 utilities and demo programs."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.1"

RPM_NAME = "ft2demos-2.13.1-1.1.aarch64.rpm"
RPM_HASH = "2c39091c71e44abe6c53764eb6a671802ef0fac79e53e2765508115cba0eba92fb0c10efab47157f22704ebeefebbf09edfd09a41c411775e5b382436d12395a"

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
