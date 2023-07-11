SUMMARY = "Translations for package kamoso"
DESCRIPTION = "Provides translations for the 'kamoso' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kamoso-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "01a4000488ab1769dc185f765e96138f9556a460d7baa2c99e85ba38c0b0c53c58620584d8fab50aba70c49aaccef5f005117c8ef68381908f20969d7f426d0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kamoso-lang \
kamoso-lang-all \
locale-kamoso-ar \
locale-kamoso-bg \
locale-kamoso-bs \
locale-kamoso-ca \
locale-kamoso-ca@valencia \
locale-kamoso-cs \
locale-kamoso-da \
locale-kamoso-de \
locale-kamoso-el \
locale-kamoso-en-GB \
locale-kamoso-eo \
locale-kamoso-es \
locale-kamoso-et \
locale-kamoso-eu \
locale-kamoso-fi \
locale-kamoso-fr \
locale-kamoso-ga \
locale-kamoso-gl \
locale-kamoso-hu \
locale-kamoso-ia \
locale-kamoso-id \
locale-kamoso-is \
locale-kamoso-it \
locale-kamoso-ja \
locale-kamoso-ka \
locale-kamoso-kk \
locale-kamoso-ko \
locale-kamoso-lt \
locale-kamoso-lv \
locale-kamoso-mai \
locale-kamoso-mr \
locale-kamoso-nb \
locale-kamoso-nds \
locale-kamoso-nl \
locale-kamoso-nn \
locale-kamoso-pa \
locale-kamoso-pl \
locale-kamoso-pt \
locale-kamoso-pt-BR \
locale-kamoso-ro \
locale-kamoso-ru \
locale-kamoso-sk \
locale-kamoso-sl \
locale-kamoso-sv \
locale-kamoso-tr \
locale-kamoso-ug \
locale-kamoso-uk \
locale-kamoso-zh-CN \
locale-kamoso-zh-TW"

RDEPENDS:${PN} += "kamoso"

inherit rpm
