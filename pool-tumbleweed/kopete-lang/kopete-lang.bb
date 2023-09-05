SUMMARY = "Translations for package kopete"
DESCRIPTION = "Provides translations for the 'kopete' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kopete-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "188b30542af436913e10fec2af167cb471f80cffdfa20a60876e0378acd289c70ad99e1844615acf1d6eb146031ab4d6db0c0f3c6080ae9b5fcc0d5d3ef98033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kopete-lang \
kopete-lang-all \
locale-kopete-ar \
locale-kopete-be \
locale-kopete-bg \
locale-kopete-bn \
locale-kopete-br \
locale-kopete-bs \
locale-kopete-ca \
locale-kopete-ca@valencia \
locale-kopete-cs \
locale-kopete-cy \
locale-kopete-da \
locale-kopete-de \
locale-kopete-el \
locale-kopete-en-GB \
locale-kopete-eo \
locale-kopete-es \
locale-kopete-et \
locale-kopete-eu \
locale-kopete-fa \
locale-kopete-fi \
locale-kopete-fr \
locale-kopete-ga \
locale-kopete-gl \
locale-kopete-he \
locale-kopete-hi \
locale-kopete-hr \
locale-kopete-hu \
locale-kopete-ia \
locale-kopete-is \
locale-kopete-it \
locale-kopete-ja \
locale-kopete-ka \
locale-kopete-kk \
locale-kopete-km \
locale-kopete-ko \
locale-kopete-lt \
locale-kopete-lv \
locale-kopete-mai \
locale-kopete-mk \
locale-kopete-ml \
locale-kopete-mr \
locale-kopete-ms \
locale-kopete-nb \
locale-kopete-nds \
locale-kopete-ne \
locale-kopete-nl \
locale-kopete-nn \
locale-kopete-oc \
locale-kopete-pa \
locale-kopete-pl \
locale-kopete-pt \
locale-kopete-pt-BR \
locale-kopete-ro \
locale-kopete-ru \
locale-kopete-si \
locale-kopete-sk \
locale-kopete-sl \
locale-kopete-sq \
locale-kopete-sr \
locale-kopete-sr@ijekavian \
locale-kopete-sr@ijekavianlatin \
locale-kopete-sr@latin \
locale-kopete-sv \
locale-kopete-ta \
locale-kopete-th \
locale-kopete-tr \
locale-kopete-ug \
locale-kopete-uk \
locale-kopete-vi \
locale-kopete-wa \
locale-kopete-zh-CN \
locale-kopete-zh-HK \
locale-kopete-zh-TW"

RDEPENDS:${PN} += "kopete"

inherit rpm
