SUMMARY = "Translations for package parted"
DESCRIPTION = "Provides translations for the 'parted' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.5"

RPM_NAME = "parted-lang-3.5-4.5.noarch.rpm"
RPM_HASH = "b391ffe9f482c10242636b5d684f29522310db0b432efd6ba335b2ae293c2afbce151c191d6dc51241f76ff8ae044bb1973ad1e73e7f50c386306d516ab0724d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-parted-ca \
locale-parted-cs \
locale-parted-da \
locale-parted-de \
locale-parted-es \
locale-parted-fr \
locale-parted-fur \
locale-parted-gl \
locale-parted-hu \
locale-parted-id \
locale-parted-it \
locale-parted-ja \
locale-parted-ko \
locale-parted-nl \
locale-parted-nn \
locale-parted-pl \
locale-parted-pt \
locale-parted-pt-BR \
locale-parted-ro \
locale-parted-ru \
locale-parted-sk \
locale-parted-sl \
locale-parted-sr \
locale-parted-sv \
locale-parted-tr \
locale-parted-uk \
locale-parted-vi \
locale-parted-zh-CN \
locale-parted-zh-TW \
parted-lang \
parted-lang-all"

RDEPENDS:${PN} += "parted"

inherit rpm
