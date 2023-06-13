SUMMARY = "ISO country flags in PNG"
DESCRIPTION = "A collection of country flags in PNG. \
They correspond to the fancy 4x3 set in 320x200 resolution."
LICENSE = "SUSE-Public-Domain"

PV = "1.0.2"

RPM_NAME = "iso-country-flags-png-1.0.2-1.11.noarch.rpm"
RPM_HASH = "f68976403c7d96507cb6cb321de1c23f26e7fe9217ccac1d1802d3b8e77bd198f54da870fc254c649bc7531e23fa4235cf9b781b762e44e67c2c0073c7a895ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iso-country-flags-png"

RDEPENDS:${PN} += ""

inherit rpm
