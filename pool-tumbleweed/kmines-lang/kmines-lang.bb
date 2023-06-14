SUMMARY = "Translations for package kmines"
DESCRIPTION = "Provides translations for the 'kmines' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kmines-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "18fa3708695b83d9421d9a5551d37ef8846e08a21eff21817a9a1d04cb5b1ff09c3b51595638f1f4aed63908e61b388bfcafd918d7ba762f824e5eacd592949f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmines-lang \
kmines-lang-all \
locale-kmines-af \
locale-kmines-ar \
locale-kmines-be \
locale-kmines-bg \
locale-kmines-bn \
locale-kmines-br \
locale-kmines-bs \
locale-kmines-ca \
locale-kmines-ca@valencia \
locale-kmines-cs \
locale-kmines-cy \
locale-kmines-da \
locale-kmines-de \
locale-kmines-el \
locale-kmines-en-GB \
locale-kmines-eo \
locale-kmines-es \
locale-kmines-et \
locale-kmines-eu \
locale-kmines-fa \
locale-kmines-fi \
locale-kmines-fr \
locale-kmines-ga \
locale-kmines-gl \
locale-kmines-he \
locale-kmines-hi \
locale-kmines-hr \
locale-kmines-hu \
locale-kmines-id \
locale-kmines-is \
locale-kmines-it \
locale-kmines-ja \
locale-kmines-ka \
locale-kmines-kk \
locale-kmines-km \
locale-kmines-ko \
locale-kmines-lt \
locale-kmines-lv \
locale-kmines-mai \
locale-kmines-mk \
locale-kmines-ml \
locale-kmines-mr \
locale-kmines-ms \
locale-kmines-nb \
locale-kmines-nds \
locale-kmines-ne \
locale-kmines-nl \
locale-kmines-nn \
locale-kmines-oc \
locale-kmines-pa \
locale-kmines-pl \
locale-kmines-pt \
locale-kmines-pt-BR \
locale-kmines-ro \
locale-kmines-ru \
locale-kmines-sk \
locale-kmines-sl \
locale-kmines-sq \
locale-kmines-sr \
locale-kmines-sr@ijekavian \
locale-kmines-sr@ijekavianlatin \
locale-kmines-sr@latin \
locale-kmines-sv \
locale-kmines-ta \
locale-kmines-th \
locale-kmines-tr \
locale-kmines-ug \
locale-kmines-uk \
locale-kmines-wa \
locale-kmines-zh-CN \
locale-kmines-zh-TW"

RDEPENDS:${PN} += "kmines"

inherit rpm
