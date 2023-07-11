SUMMARY = "YaST2 - Serbian (Latin) Translations"
DESCRIPTION = "YaST2 - Translations for Serbian (Latin)."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-sr-latin-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "521c605e7ae9038bfdd56a6b9f9ffb00dce317da8a58b9bb6ad41779318f801801b766894968def677da66ce4994a78b921486780460edbc4336203534d26197"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sr@latin \
yast2-trans-sr-latin"

RDEPENDS:${PN} += ""

inherit rpm
