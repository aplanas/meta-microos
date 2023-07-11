SUMMARY = "Translations for package kongress"
DESCRIPTION = "Provides translations for the 'kongress' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "kongress-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "32b41b0f66c29c0cf55f2fd847c96e069aee1c427ab61a388f3dbd9f2da46104ece55d3aa4fd3f378f0fb48f1f1f3c8f0da0cf36dad16084dc3967bfc4e1264a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kongress-lang \
kongress-lang-all \
locale-kongress-ca \
locale-kongress-ca@valencia \
locale-kongress-cs \
locale-kongress-da \
locale-kongress-de \
locale-kongress-el \
locale-kongress-en-GB \
locale-kongress-es \
locale-kongress-et \
locale-kongress-fi \
locale-kongress-fr \
locale-kongress-gl \
locale-kongress-ia \
locale-kongress-it \
locale-kongress-ja \
locale-kongress-ka \
locale-kongress-ko \
locale-kongress-lt \
locale-kongress-nl \
locale-kongress-nn \
locale-kongress-pa \
locale-kongress-pl \
locale-kongress-pt \
locale-kongress-pt-BR \
locale-kongress-ro \
locale-kongress-ru \
locale-kongress-sk \
locale-kongress-sl \
locale-kongress-sv \
locale-kongress-tr \
locale-kongress-uk \
locale-kongress-zh-CN \
locale-kongress-zh-TW"

RDEPENDS:${PN} += "kongress"

inherit rpm
