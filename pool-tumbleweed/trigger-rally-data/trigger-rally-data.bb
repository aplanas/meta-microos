SUMMARY = "Data files for trigger-rally"
DESCRIPTION = "This package provides the data files for trigger-rally, a 3D rally simulation \
with a physics engine for drifting, over 100 maps, different terrain materials \
like dirt, asphalt, sand, ice etc. and various weather, light and fog conditions. \
Most maps are equipped with spoken co-driver notes and co-driver icons."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.6.1"

RPM_NAME = "trigger-rally-data-0.6.6.1-3.8.noarch.rpm"
RPM_HASH = "a6eec1ade47a6615aa4dfeff129b4ac88b987d06edae07b62fbee1486233b100354f95fe992d8d1d2347fb7d5508b7b2acdfafba53100228d5ea98fa5991c046"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "trigger-rally-data"
RDEPENDS:${PN} += "trigger-rally"

inherit rpm
