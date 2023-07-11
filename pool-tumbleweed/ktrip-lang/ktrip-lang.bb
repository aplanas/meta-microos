SUMMARY = "Translations for package ktrip"
DESCRIPTION = "Provides translations for the 'ktrip' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "ktrip-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "373dcaa7afc8293d7804b981d6e2b843159cf97fadb07f4c5004b8a26e00ccaf0aff72d9c3b558c061211b23265ae7431438bf40a5c91d4c5c1ad910b4be61fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktrip-lang \
ktrip-lang-all \
locale-ktrip-ca \
locale-ktrip-ca@valencia \
locale-ktrip-cs \
locale-ktrip-de \
locale-ktrip-en-GB \
locale-ktrip-es \
locale-ktrip-et \
locale-ktrip-fi \
locale-ktrip-fr \
locale-ktrip-gl \
locale-ktrip-ia \
locale-ktrip-it \
locale-ktrip-ja \
locale-ktrip-ka \
locale-ktrip-ko \
locale-ktrip-lt \
locale-ktrip-nl \
locale-ktrip-nn \
locale-ktrip-pl \
locale-ktrip-pt \
locale-ktrip-pt-BR \
locale-ktrip-ru \
locale-ktrip-sk \
locale-ktrip-sl \
locale-ktrip-sv \
locale-ktrip-tr \
locale-ktrip-uk \
locale-ktrip-zh-CN \
locale-ktrip-zh-TW"

RDEPENDS:${PN} += "ktrip"

inherit rpm
