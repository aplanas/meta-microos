SUMMARY = "YaST2 - Hebrew Translations"
DESCRIPTION = "YaST2 - Translations for Hebrew."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-he-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "98ed97cefda24c056ac55f533f997a240437ab64fd1ca3bb5c0289dc5586cff74b846de81cf398b29c6ecd39767c9453209180dbccdf82eec9c4b4468ed788bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-he \
yast2-trans-he"

RDEPENDS:${PN} += ""

inherit rpm
