SUMMARY = "Translations for package tokodon"
DESCRIPTION = "Provides translations for the 'tokodon' package."
LICENSE = "GPL-3.0-only"

PV = "23.04.3"

RPM_NAME = "tokodon-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "30130ac74944ac47486b93c46cb756557351f1a2968c5d368624692d2519f178f23468fee3414e65df8a10b9d23b2e48790e8499bb25eb1c6bb14f5037ffb240"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tokodon-ca \
locale-tokodon-ca@valencia \
locale-tokodon-cs \
locale-tokodon-de \
locale-tokodon-en-GB \
locale-tokodon-es \
locale-tokodon-eu \
locale-tokodon-fi \
locale-tokodon-fr \
locale-tokodon-gl \
locale-tokodon-hu \
locale-tokodon-id \
locale-tokodon-is \
locale-tokodon-it \
locale-tokodon-ja \
locale-tokodon-ka \
locale-tokodon-ko \
locale-tokodon-lt \
locale-tokodon-nl \
locale-tokodon-pl \
locale-tokodon-pt \
locale-tokodon-pt-BR \
locale-tokodon-ru \
locale-tokodon-sk \
locale-tokodon-sl \
locale-tokodon-sv \
locale-tokodon-tr \
locale-tokodon-uk \
locale-tokodon-zh-CN \
locale-tokodon-zh-TW \
tokodon-lang \
tokodon-lang-all"

RDEPENDS:${PN} += "tokodon"

inherit rpm
