SUMMARY = "Extra themes for the Aisleriot solitaire card game program"
DESCRIPTION = "Aisleriot is a compilation of 80 different solitaire card games. \
 \
This package provides extra themes for Aisleriot."
LICENSE = "GPL-3.0-or-later"

PV = "3.22.29"

RPM_NAME = "aisleriot-themes-3.22.29-1.1.noarch.rpm"
RPM_HASH = "e08fa727c59cb7f359885c50c400da419d1bb1767945a0b57b97bd317e6958101654ce25a6756abe27e1c54487412b5267032c2e12f577af593e38145ec92e11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aisleriot-themes"
RDEPENDS:${PN} += "aisleriot"

inherit rpm
