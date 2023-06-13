SUMMARY = "Data files for the Red Eclipse game"
DESCRIPTION = "This package contains the data files (maps, models, textures, sounds, etc.) for the Red Eclipse game."
LICENSE = "CC-BY-SA-3.0 & Zlib"

PV = "2.0.0"

RPM_NAME = "redeclipse-data-2.0.0-4.5.noarch.rpm"
RPM_HASH = "7c5051e0287cbd8396540850ca572c8c863d6d23bb84b88b5d86a30bf859a1e1c87a7c60b9aa29c717c30ab729c0f4f55bd8975bb9c6895a528581fafe6f89ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "redeclipse-data"

RDEPENDS:${PN} += ""

inherit rpm
