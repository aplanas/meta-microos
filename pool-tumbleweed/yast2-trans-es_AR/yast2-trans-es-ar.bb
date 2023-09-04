SUMMARY = "YaST2 - Spanish (Argentina) Translations"
DESCRIPTION = "YaST2 - Spanish (Argentina) Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-es_AR-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "7e11a8b3d214dc08c21405b5ba17546f0bd98f4a6f64a3c586ee265bae28b75277df5d135770ac572c002bb8557c283438fea374c416c637b6d623d0157c762e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-es-AR \
yast2-trans-es-AR"

RDEPENDS:${PN} += ""

inherit rpm
