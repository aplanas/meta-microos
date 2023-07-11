SUMMARY = "Data files for the Red Eclipse game"
DESCRIPTION = "This package contains the data files (maps, models, textures, sounds, etc.) for the Red Eclipse game."
LICENSE = "CC-BY-SA-3.0 & Zlib"

PV = "2.0.0"

RPM_NAME = "redeclipse-data-2.0.0-4.6.noarch.rpm"
RPM_HASH = "3ec2f90763cddd2af9d03c63073a3ce83eeac67be6d6d08578a3fee6946fcda125293327d482c1c65abafb36254e463b49afa512507a1f8a5647255fbe31aa29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "redeclipse-data"

RDEPENDS:${PN} += ""

inherit rpm
