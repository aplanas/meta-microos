SUMMARY = "Translations for package libKPim5Itinerary5"
DESCRIPTION = "Provides translations for the 'libKPim5Itinerary5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5Itinerary5-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "043c5eaa20bc5cc7d80d9c548a7fb6c1861bb90c54cb0ba8d80fe37d40c78bccf5a22af64a5cc7f3eb66150a501867ab58efaa925b0a075eb8b586560bbc58e2"
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
