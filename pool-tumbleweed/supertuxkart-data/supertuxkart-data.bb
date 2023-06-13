SUMMARY = "Data files for SuperTuxKart"
DESCRIPTION = "Data files for SuperTuxKart a Free 3d kart racing game."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.4"

RPM_NAME = "supertuxkart-data-1.4-4.2.noarch.rpm"
RPM_HASH = "7e421eb0e22a183c2657fe86731cceb4c4d9d08b5f95764b48d35fe55cf56cd8259ba4d738d5fd138cdac96c834a88a502bf02f2cfdedcbf6bdecbf4cc908c44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "supertuxkart-data"

RDEPENDS:${PN} += "supertuxkart"

inherit rpm
