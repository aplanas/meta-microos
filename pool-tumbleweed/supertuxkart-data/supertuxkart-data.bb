SUMMARY = "Data files for SuperTuxKart"
DESCRIPTION = "Data files for SuperTuxKart a Free 3d kart racing game."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.4"

RPM_NAME = "supertuxkart-data-1.4-4.3.noarch.rpm"
RPM_HASH = "5344d1c9ab071db7880ff2821b1342c09e01c1e97dce851221f62649963047d67275e3b7ec35de3454900eff6be8ae0fc9c905ca5ada1fc96d97e89549c14f8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "supertuxkart-data"

RDEPENDS:${PN} += "supertuxkart"

inherit rpm
