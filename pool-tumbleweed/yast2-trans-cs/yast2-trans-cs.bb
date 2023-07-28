SUMMARY = "YaST2 - Czech Translations"
DESCRIPTION = "YaST2 - Czech translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-cs-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "88fb87c377cbc316e5b0eef0f142bfdcfd747e9ef7c78b8e3333e2a14252a9e5c3bdbd070579c7779d803659ffb16543227b666ae6a8e7f9eae45bac6121edaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-cs \
yast2-trans-cs"

RDEPENDS:${PN} += ""

inherit rpm
