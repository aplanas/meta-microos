SUMMARY = "Data files for trigger-rally"
DESCRIPTION = "This package provides the data files for trigger-rally, a 3D rally simulation \
with a physics engine for drifting, over 100 maps, different terrain materials \
like dirt, asphalt, sand, ice etc. and various weather, light and fog conditions. \
Most maps are equipped with spoken co-driver notes and co-driver icons."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.6.1"

RPM_NAME = "trigger-rally-data-0.6.6.1-3.9.noarch.rpm"
RPM_HASH = "fe660be77afa4c50f8e485e8bbc74ad3d8463acce44aff70f0442ae43a71992cdc3df9c906dde60ebd0505a45904a370c1db92bb968101da1d5dbbb391dfbeb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "trigger-rally-data"

RDEPENDS:${PN} += "trigger-rally"

inherit rpm
