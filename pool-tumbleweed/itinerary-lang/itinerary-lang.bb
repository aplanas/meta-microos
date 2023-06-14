SUMMARY = "Translations for package itinerary"
DESCRIPTION = "Provides translations for the 'itinerary' package."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "itinerary-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "ba8b2fa30cd1a8f7f7c8a25b6fc803b7504f3e40d12ff9b6f1579cb76f2ceb24b53781ce882ce4268663c4960ec29fedaf9f5616383169ed63b0939e9b313618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "itinerary-lang \
itinerary-lang-all \
locale-itinerary-ca \
locale-itinerary-ca@valencia \
locale-itinerary-cs \
locale-itinerary-de \
locale-itinerary-en-GB \
locale-itinerary-es \
locale-itinerary-et \
locale-itinerary-eu \
locale-itinerary-fi \
locale-itinerary-fr \
locale-itinerary-gl \
locale-itinerary-ia \
locale-itinerary-it \
locale-itinerary-ja \
locale-itinerary-ka \
locale-itinerary-ko \
locale-itinerary-lt \
locale-itinerary-nl \
locale-itinerary-pl \
locale-itinerary-pt \
locale-itinerary-pt-BR \
locale-itinerary-ru \
locale-itinerary-sk \
locale-itinerary-sl \
locale-itinerary-sv \
locale-itinerary-tr \
locale-itinerary-uk \
locale-itinerary-zh-CN \
locale-itinerary-zh-TW"

RDEPENDS:${PN} += "itinerary"

inherit rpm
