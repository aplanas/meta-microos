SUMMARY = "YaST2 - Spanish Translations"
DESCRIPTION = "YaST2 - Spanish Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-es-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "c23364d26a4c484e4ba6bf98bfccceea127c80465f19e481e93ac8a8edf6f8e9c0e0505f5898ece85b869d7553d5a77263efbb8cee69ff140e530fd5c1407a50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-es \
yast2-trans-es"

RDEPENDS:${PN} += ""

inherit rpm
