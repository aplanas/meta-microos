SUMMARY = "Translations for package klettres"
DESCRIPTION = "Provides translations for the 'klettres' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "klettres-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "7f247b73bf50f15a9ee20c79092cb9be284f872d05d75df13ad7283b3a0f2592e8508a6c4f8b43e647a58e6e5ad642d59caaabfe4adabc61ce1a4655584a59df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "klettres-lang \
klettres-lang-all \
locale-klettres-af \
locale-klettres-ar \
locale-klettres-be \
locale-klettres-bg \
locale-klettres-bn \
locale-klettres-br \
locale-klettres-bs \
locale-klettres-ca \
locale-klettres-ca@valencia \
locale-klettres-cs \
locale-klettres-cy \
locale-klettres-da \
locale-klettres-de \
locale-klettres-el \
locale-klettres-en-GB \
locale-klettres-eo \
locale-klettres-es \
locale-klettres-et \
locale-klettres-eu \
locale-klettres-fa \
locale-klettres-fi \
locale-klettres-fr \
locale-klettres-ga \
locale-klettres-gl \
locale-klettres-gu \
locale-klettres-he \
locale-klettres-hi \
locale-klettres-hr \
locale-klettres-hu \
locale-klettres-id \
locale-klettres-is \
locale-klettres-it \
locale-klettres-ja \
locale-klettres-ka \
locale-klettres-kk \
locale-klettres-km \
locale-klettres-ko \
locale-klettres-lt \
locale-klettres-lv \
locale-klettres-mk \
locale-klettres-ml \
locale-klettres-mr \
locale-klettres-ms \
locale-klettres-nb \
locale-klettres-nds \
locale-klettres-ne \
locale-klettres-nl \
locale-klettres-nn \
locale-klettres-oc \
locale-klettres-pa \
locale-klettres-pl \
locale-klettres-pt \
locale-klettres-pt-BR \
locale-klettres-ro \
locale-klettres-ru \
locale-klettres-si \
locale-klettres-sk \
locale-klettres-sl \
locale-klettres-sq \
locale-klettres-sv \
locale-klettres-ta \
locale-klettres-tr \
locale-klettres-ug \
locale-klettres-uk \
locale-klettres-vi \
locale-klettres-wa \
locale-klettres-zh-CN \
locale-klettres-zh-TW"

RDEPENDS:${PN} += "klettres"

inherit rpm
