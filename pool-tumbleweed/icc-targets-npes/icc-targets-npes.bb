SUMMARY = "NPES Printing Characterisation Data"
DESCRIPTION = "Printing characterisation data. These are CMYK \
characterisation data for GRACoL, SWOP and SNAP."
LICENSE = "Zlib"

PV = "1.0"

RPM_NAME = "icc-targets-npes-1.0-16.21.noarch.rpm"
RPM_HASH = "8173e373987ac1937edb0eb829371ae2b1e9abf545c3974d4ce95d553a754a58eca81aee623d58f22ae6dc80932f84a9fa1e6a97d1cb526200fc9968291d0bdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-targets-npes"

RDEPENDS:${PN} += "color-filesystem"

inherit rpm
