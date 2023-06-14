SUMMARY = "Freetype2 Utilities and Demo Programs"
DESCRIPTION = "Freetype2 utilities and demo programs."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ft2demos-2.13.0-4.1.aarch64.rpm"
RPM_HASH = "dff5af5ef324f7560237d0db23857701b93a934db5bb7e2ea8d5b474e452580ec8bfd187d5bbd4ce2bcc02065afa7e3ca8d3293aeafe3634f97a4764a0515af1"

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
