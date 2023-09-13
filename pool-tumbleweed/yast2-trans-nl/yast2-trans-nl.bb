SUMMARY = "YaST2 - Dutch Translations"
DESCRIPTION = "YaST2 - Translations for Dutch."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-nl-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "46d53cff2b9c46dd9f56146ec167dc11c5abab05c669001e2327772b6b6a341d201bc095b86e501083014ef7a7922fd951d51c8c394b24a2a8b1d7780020dd09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nl \
yast2-trans-nl"

RDEPENDS:${PN} += ""

inherit rpm
