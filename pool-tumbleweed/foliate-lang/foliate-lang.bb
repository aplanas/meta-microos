SUMMARY = "Translations for package foliate"
DESCRIPTION = "Provides translations for the 'foliate' package."
LICENSE = "GPL-3.0-only"

PV = "2.6.4"

RPM_NAME = "foliate-lang-2.6.4-2.5.noarch.rpm"
RPM_HASH = "3f08e8247f54ed932c336866f8fe2fb3071949137a8b39ed3389a9f3a5af9cc0d2ed3f7564cbdad97ed3588818d8c2b9f076e78da755fab6e56de1dfe9200233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "foliate-lang \
foliate-lang-all \
locale(foliate:cs) \
locale(foliate:de) \
locale(foliate:es) \
locale(foliate:eu) \
locale(foliate:fr) \
locale(foliate:id) \
locale(foliate:it) \
locale(foliate:ko) \
locale(foliate:nb) \
locale(foliate:nl) \
locale(foliate:nn) \
locale(foliate:pt_BR) \
locale(foliate:ru) \
locale(foliate:sv) \
locale(foliate:uk) \
locale(foliate:zh_CN) \
locale(foliate:zh_TW)"

RDEPENDS:${PN} += "foliate"

inherit rpm
