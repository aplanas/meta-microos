SUMMARY = "Documentation for bsh2"
DESCRIPTION = "Scripting for Java (BeanShell Version 2.x) (Manual)."
LICENSE = "LGPL-2.0-or-later | SPL-1.0"

PV = "2.1.1"

RPM_NAME = "bsh2-manual-2.1.1-1.1.noarch.rpm"
RPM_HASH = "b3533ec95bd18eaaf42396c8456558fda598f7d5a9517eaf80ac79c29652a8c9971ba3de0abc59cbccb87445c525ec3f4924525c156876efe837dd40279991ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bsh2-manual"

RDEPENDS:${PN} += ""

inherit rpm
