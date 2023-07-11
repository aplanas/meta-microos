SUMMARY = "SCAP content"
DESCRIPTION = "SCAP content for Fedora delivered by Open-SCAP project."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.8"

RPM_NAME = "openscap-content-1.3.8-1.1.aarch64.rpm"
RPM_HASH = "d95f19111abc75c73eb5d17d291e8172e5c3bef0214e250f692ca8c3f1c827cfef16c71dcfca69f3f76be886ea5987941970ed62de61e0d3a26bc596eb0f288e"

RPROVIDES:${PN} += "openscap-content"

RDEPENDS:${PN} += "libopenscap25 \
openscap"

inherit rpm
