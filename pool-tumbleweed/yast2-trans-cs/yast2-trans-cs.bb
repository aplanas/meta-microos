SUMMARY = "YaST2 - Czech Translations"
DESCRIPTION = "YaST2 - Czech translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-cs-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "90b6301426d3548043762d9c769cd71e6876bed15e5a3bcc8696f322849219cd2bf48fe9b94a6fd03a352f73d6dc26497a89b3c6b4d4eaa097b0af7779d98f0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-cs \
yast2-trans-cs"

RDEPENDS:${PN} += ""

inherit rpm
