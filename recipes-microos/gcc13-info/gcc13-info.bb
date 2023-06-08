SUMMARY = "Documentation for the GNU compiler collection"
DESCRIPTION = "GNU info-pages for the GNU compiler collection covering both user-level \
and internals documentation."
LICENSE = "GFDL-1.2-only"

PV = "13.0.1+git7231"

RPM_NAME = "gcc13-info-13.0.1+git7231-1.1.noarch.rpm"
RPM_HASH = "e7c9db6818128ac74431c3b82cd59b050e7d626898a1c5350824f80a74e83b6d69332f23961c2de62335530f9891b6aa9ffa4a84fbaff302d6d9b3dcdc19bbcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcc13-info"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
