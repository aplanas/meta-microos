SUMMARY = "Settings Manager for Compiz -- Common files"
DESCRIPTION = "Common files for the Compiz Config and Settings tool (CCSM)."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compizconfig-settings-manager-common-0.8.18-2.11.noarch.rpm"
RPM_HASH = "2789f4f24c3ec45bdc689b9b02e464640758ddc944ebe70398838cc8b3142e65ba84e78f7947d06416180f8403be256094a2c5b28ca4ab7313e386d21092e24f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compizconfig-settings-manager-common"

RDEPENDS:${PN} += ""

inherit rpm
