SUMMARY = "YaST2 - Esperanto Translations"
DESCRIPTION = "YaST2 - Translations for Esperanto."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-eu-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "d8ec4d2b90074e7ac2fe4fccb7cdb7d6f104d59f3d81f2ae559afe48cf670d595b1930c7bd79025730720d018824782c4d64038192918548e6e96b9b2a3c18cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-eu \
yast2-trans-eu"

RDEPENDS:${PN} += ""

inherit rpm
