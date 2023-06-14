SUMMARY = "Translations for package libKPim5Itinerary5"
DESCRIPTION = "Provides translations for the 'libKPim5Itinerary5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5Itinerary5-lang-23.04.1-1.2.noarch.rpm"
RPM_HASH = "4792caee2323835aaa42e12cd1cc4d83847763a84b5ea6a472ec7237d279eb39e0fed5e4af00cfcc497ed2dd65b0ee3851e5d049a0e04a9edd5307e17819a944"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKPim5Itinerary5-lang \
libKPim5Itinerary5-lang-all \
locale-libKPim5Itinerary5-ar \
locale-libKPim5Itinerary5-ca \
locale-libKPim5Itinerary5-ca@valencia \
locale-libKPim5Itinerary5-cs \
locale-libKPim5Itinerary5-da \
locale-libKPim5Itinerary5-de \
locale-libKPim5Itinerary5-en-GB \
locale-libKPim5Itinerary5-es \
locale-libKPim5Itinerary5-et \
locale-libKPim5Itinerary5-eu \
locale-libKPim5Itinerary5-fi \
locale-libKPim5Itinerary5-fr \
locale-libKPim5Itinerary5-gl \
locale-libKPim5Itinerary5-ia \
locale-libKPim5Itinerary5-it \
locale-libKPim5Itinerary5-ja \
locale-libKPim5Itinerary5-ka \
locale-libKPim5Itinerary5-ko \
locale-libKPim5Itinerary5-lt \
locale-libKPim5Itinerary5-nl \
locale-libKPim5Itinerary5-nn \
locale-libKPim5Itinerary5-pl \
locale-libKPim5Itinerary5-pt \
locale-libKPim5Itinerary5-pt-BR \
locale-libKPim5Itinerary5-ru \
locale-libKPim5Itinerary5-sk \
locale-libKPim5Itinerary5-sl \
locale-libKPim5Itinerary5-sv \
locale-libKPim5Itinerary5-tr \
locale-libKPim5Itinerary5-uk \
locale-libKPim5Itinerary5-zh-CN \
locale-libKPim5Itinerary5-zh-TW"

RDEPENDS:${PN} += "libKPim5Itinerary5"

inherit rpm
