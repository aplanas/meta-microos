SUMMARY = "Translations for package itinerary"
DESCRIPTION = "Provides translations for the 'itinerary' package."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "itinerary-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "5728affcc469902eeeaeffed50d0f46f9694abbe7cd996db1d040d84d3437e0c4615baa4df00695e096882ea49fd4ba1c401a49b41842923003db551b0b281f7"
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
