SUMMARY = "YaST2 - Danish Translations"
DESCRIPTION = "YaST2 - Translations for Danish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-da-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "8a2a1e87111706a2e325bc16f36bdfeed3b08ff8c606c7e8ab9c8abc1c32cfbd9e37a1215af05140f11b71b8e622374065cc5b56f891ce66c2696392d91a37fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-da \
yast2-trans-da"

RDEPENDS:${PN} += ""

inherit rpm
