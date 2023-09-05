SUMMARY = "Palapeli's standard puzzle files"
DESCRIPTION = "This package contains the standard puzzle files for Palapeli."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "palapeli-data-23.08.0-1.1.noarch.rpm"
RPM_HASH = "118ae8ea160c35e75825c91434b86097950fc0d81345420f1e6d9790f909dbed2453f6e9b65111792b05705948cd4f6a249dba4e95bd946dcb28c9bc93847ec8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-palapeli-data \
palapeli-data"

RDEPENDS:${PN} += "palapeli"

inherit rpm
