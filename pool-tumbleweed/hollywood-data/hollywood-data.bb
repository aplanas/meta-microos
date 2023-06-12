SUMMARY = "Data files for hollywood"
DESCRIPTION = "Data files needed for the 'hollywood' package."
LICENSE = "CC0-1.0"

PV = "1.21"

RPM_NAME = "hollywood-data-1.21-3.6.noarch.rpm"
RPM_HASH = "1d0598bf7ed3ad1328191b6d32ccdb5b849d53553b41aa8975752be22c68d45b07097039db1c7b115999a74d79ef3aed37aa2fcf7822a36c5254ce4049ea1fa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hollywood-data"
RDEPENDS:${PN} += ""

inherit rpm
