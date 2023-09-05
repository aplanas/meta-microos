SUMMARY = "Translations for package itinerary"
DESCRIPTION = "Provides translations for the 'itinerary' package."
LICENSE = "LGPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "itinerary-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "157266dcdbeeb6f2185afc5afcbfe5fdd7f966863805077c89ec2ac0f390e6df5dd0b405ffbb364adfa0c8f35a325d5fe6fc9d6633826717f8220cf7834e7d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "itinerary-lang \
itinerary-lang-all \
locale-itinerary-ar \
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
