SUMMARY = "Translations for package kruler"
DESCRIPTION = "Provides translations for the 'kruler' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kruler-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "f3bbfef0168be987f0d0e67d446df225209723fb3cda8211ccabcf9513a7a99fd3e5ffd5841789c63b251385c21fdc0b5f35bffb2a125ffdc993a68a4d5057e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kruler-lang \
kruler-lang-all \
locale-kruler-af \
locale-kruler-ar \
locale-kruler-be \
locale-kruler-bg \
locale-kruler-br \
locale-kruler-bs \
locale-kruler-ca \
locale-kruler-ca@valencia \
locale-kruler-cs \
locale-kruler-cy \
locale-kruler-da \
locale-kruler-de \
locale-kruler-el \
locale-kruler-en-GB \
locale-kruler-eo \
locale-kruler-es \
locale-kruler-et \
locale-kruler-eu \
locale-kruler-fa \
locale-kruler-fi \
locale-kruler-fr \
locale-kruler-ga \
locale-kruler-gl \
locale-kruler-he \
locale-kruler-hi \
locale-kruler-hr \
locale-kruler-hu \
locale-kruler-ia \
locale-kruler-id \
locale-kruler-is \
locale-kruler-it \
locale-kruler-ja \
locale-kruler-ka \
locale-kruler-kk \
locale-kruler-km \
locale-kruler-ko \
locale-kruler-lt \
locale-kruler-lv \
locale-kruler-mk \
locale-kruler-ml \
locale-kruler-mr \
locale-kruler-ms \
locale-kruler-nb \
locale-kruler-nds \
locale-kruler-ne \
locale-kruler-nl \
locale-kruler-nn \
locale-kruler-oc \
locale-kruler-pa \
locale-kruler-pl \
locale-kruler-pt \
locale-kruler-pt-BR \
locale-kruler-ro \
locale-kruler-ru \
locale-kruler-si \
locale-kruler-sk \
locale-kruler-sl \
locale-kruler-sq \
locale-kruler-sr \
locale-kruler-sr@ijekavian \
locale-kruler-sr@ijekavianlatin \
locale-kruler-sr@latin \
locale-kruler-sv \
locale-kruler-ta \
locale-kruler-th \
locale-kruler-tr \
locale-kruler-ug \
locale-kruler-uk \
locale-kruler-vi \
locale-kruler-zh-CN \
locale-kruler-zh-HK \
locale-kruler-zh-TW"

RDEPENDS:${PN} += "kruler"

inherit rpm
