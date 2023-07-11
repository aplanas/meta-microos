SUMMARY = "YaST2 - Serbian Translations"
DESCRIPTION = "YaST2 - Translations for Serbian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-sr-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "d8479c41082a30be10f2a36b6966b147a78c71232392e33276cba65373e114ecaf03a0c4566618570ce55c78e41eb347ec6f2af43227b116ee3da205375d630f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sr \
yast2-trans-sr"

RDEPENDS:${PN} += ""

inherit rpm
