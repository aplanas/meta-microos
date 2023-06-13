SUMMARY = "YaST2 - Georgian Translations"
DESCRIPTION = "YaST2 - Translations for Georgian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-ka-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "e6248768fe5698a7f54c757cee1f2a48473b2e5956b595e369a689b1fa0f4830ff21e62b53f4f055bf4c4759417c1e3c59c1108b128863582f7169a6bfcdb039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ka) \
yast2-trans-ka"

RDEPENDS:${PN} += ""

inherit rpm
