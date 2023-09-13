SUMMARY = "YaST2 - Bosnian Translations"
DESCRIPTION = "YaST2 - Translations for Bosnian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-bs-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "0ee73ee64da460e65ed8c0b344b25fadfe7783d3d5a5e8c952572def4a0c3c478f1b9fb7cdf3f8be3aab0ef024260812301175daff4377219e7e12196e04582d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-bs \
yast2-trans-bs"

RDEPENDS:${PN} += ""

inherit rpm
