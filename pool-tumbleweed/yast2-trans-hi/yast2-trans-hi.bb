SUMMARY = "YaST2 - Hindi Translations"
DESCRIPTION = "YaST2 - Translations for Hindi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-hi-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "7814746060e8bb0dd8dc10647ec6deaa08dbffd94af2c827c7b4432be1d8a55a931fc59330bfb3782d83f86a1528e49a42ee277dba52d2fa7a70cf175889fdbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-hi \
yast2-trans-hi"

RDEPENDS:${PN} += ""

inherit rpm
