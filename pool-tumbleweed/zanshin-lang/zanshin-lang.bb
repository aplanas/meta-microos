SUMMARY = "Translations for package zanshin"
DESCRIPTION = "Provides translations for the 'zanshin' package."
LICENSE = "GPL-2.0-only"

PV = "23.04.3"

RPM_NAME = "zanshin-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "e2b64645fcb4948daf6eb295d0699ae7bd75d90907be18df3287594efa3548d4efe9a37a61addec7dbb68e93e51efa88aa39c4389e20298dd976de81a3add6f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-zanshin-bg \
locale-zanshin-bs \
locale-zanshin-ca \
locale-zanshin-ca@valencia \
locale-zanshin-cs \
locale-zanshin-da \
locale-zanshin-de \
locale-zanshin-en-GB \
locale-zanshin-es \
locale-zanshin-et \
locale-zanshin-eu \
locale-zanshin-fi \
locale-zanshin-fr \
locale-zanshin-ga \
locale-zanshin-gl \
locale-zanshin-hu \
locale-zanshin-ia \
locale-zanshin-it \
locale-zanshin-ja \
locale-zanshin-ka \
locale-zanshin-ko \
locale-zanshin-lt \
locale-zanshin-mr \
locale-zanshin-nb \
locale-zanshin-nds \
locale-zanshin-nl \
locale-zanshin-nn \
locale-zanshin-pl \
locale-zanshin-pt \
locale-zanshin-pt-BR \
locale-zanshin-ru \
locale-zanshin-sk \
locale-zanshin-sl \
locale-zanshin-sv \
locale-zanshin-tr \
locale-zanshin-ug \
locale-zanshin-uk \
locale-zanshin-zh-CN \
locale-zanshin-zh-TW \
zanshin-lang \
zanshin-lang-all"

RDEPENDS:${PN} += "zanshin"

inherit rpm
