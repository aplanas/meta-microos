SUMMARY = "Translations for package khelpcenter5"
DESCRIPTION = "Provides translations for the 'khelpcenter5' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "khelpcenter5-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "f83250d76d44a695223e42a8f1cf919a82ac979f4545eaa09ad3cf7f6b64afb9ce85ae6b9f9bd57fe23eb4bd03ae7477af37b5f80d833a8e52077e7699336068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "khelpcenter5-lang \
khelpcenter5-lang-all \
locale-khelpcenter5-af \
locale-khelpcenter5-ar \
locale-khelpcenter5-be \
locale-khelpcenter5-be@latin \
locale-khelpcenter5-bg \
locale-khelpcenter5-bn \
locale-khelpcenter5-bn-IN \
locale-khelpcenter5-br \
locale-khelpcenter5-bs \
locale-khelpcenter5-ca \
locale-khelpcenter5-ca@valencia \
locale-khelpcenter5-cs \
locale-khelpcenter5-cy \
locale-khelpcenter5-da \
locale-khelpcenter5-de \
locale-khelpcenter5-el \
locale-khelpcenter5-en-GB \
locale-khelpcenter5-eo \
locale-khelpcenter5-es \
locale-khelpcenter5-et \
locale-khelpcenter5-eu \
locale-khelpcenter5-fa \
locale-khelpcenter5-fi \
locale-khelpcenter5-fr \
locale-khelpcenter5-ga \
locale-khelpcenter5-gl \
locale-khelpcenter5-gu \
locale-khelpcenter5-he \
locale-khelpcenter5-hi \
locale-khelpcenter5-hr \
locale-khelpcenter5-hu \
locale-khelpcenter5-ia \
locale-khelpcenter5-id \
locale-khelpcenter5-is \
locale-khelpcenter5-it \
locale-khelpcenter5-ja \
locale-khelpcenter5-ka \
locale-khelpcenter5-kk \
locale-khelpcenter5-km \
locale-khelpcenter5-kn \
locale-khelpcenter5-ko \
locale-khelpcenter5-lt \
locale-khelpcenter5-lv \
locale-khelpcenter5-mai \
locale-khelpcenter5-mk \
locale-khelpcenter5-ml \
locale-khelpcenter5-mr \
locale-khelpcenter5-ms \
locale-khelpcenter5-nb \
locale-khelpcenter5-nds \
locale-khelpcenter5-ne \
locale-khelpcenter5-nl \
locale-khelpcenter5-nn \
locale-khelpcenter5-oc \
locale-khelpcenter5-or \
locale-khelpcenter5-pa \
locale-khelpcenter5-pl \
locale-khelpcenter5-pt \
locale-khelpcenter5-pt-BR \
locale-khelpcenter5-ro \
locale-khelpcenter5-ru \
locale-khelpcenter5-si \
locale-khelpcenter5-sk \
locale-khelpcenter5-sl \
locale-khelpcenter5-sq \
locale-khelpcenter5-sr \
locale-khelpcenter5-sr@ijekavian \
locale-khelpcenter5-sr@ijekavianlatin \
locale-khelpcenter5-sr@latin \
locale-khelpcenter5-sv \
locale-khelpcenter5-ta \
locale-khelpcenter5-te \
locale-khelpcenter5-th \
locale-khelpcenter5-tr \
locale-khelpcenter5-ug \
locale-khelpcenter5-uk \
locale-khelpcenter5-vi \
locale-khelpcenter5-wa \
locale-khelpcenter5-zh-CN \
locale-khelpcenter5-zh-TW"

RDEPENDS:${PN} += "khelpcenter5"

inherit rpm
