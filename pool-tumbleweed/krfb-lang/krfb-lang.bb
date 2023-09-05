SUMMARY = "Translations for package krfb"
DESCRIPTION = "Provides translations for the 'krfb' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "krfb-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "6ff8de0aefd91940b755f8d5218764670ad594d25ad272cfa38d88e8f12d8592c0c6804469ddfd1adae6c61d9fe02b81c6d314e121e76dfa5c282515e6c94852"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "krfb-lang \
krfb-lang-all \
locale-krfb-af \
locale-krfb-ar \
locale-krfb-be \
locale-krfb-bg \
locale-krfb-br \
locale-krfb-bs \
locale-krfb-ca \
locale-krfb-ca@valencia \
locale-krfb-cs \
locale-krfb-cy \
locale-krfb-da \
locale-krfb-de \
locale-krfb-el \
locale-krfb-en-GB \
locale-krfb-eo \
locale-krfb-es \
locale-krfb-et \
locale-krfb-eu \
locale-krfb-fa \
locale-krfb-fi \
locale-krfb-fr \
locale-krfb-ga \
locale-krfb-gl \
locale-krfb-he \
locale-krfb-hi \
locale-krfb-hr \
locale-krfb-hu \
locale-krfb-ia \
locale-krfb-id \
locale-krfb-is \
locale-krfb-it \
locale-krfb-ja \
locale-krfb-ka \
locale-krfb-kk \
locale-krfb-km \
locale-krfb-ko \
locale-krfb-lt \
locale-krfb-lv \
locale-krfb-mai \
locale-krfb-mk \
locale-krfb-ml \
locale-krfb-mr \
locale-krfb-ms \
locale-krfb-nb \
locale-krfb-nds \
locale-krfb-ne \
locale-krfb-nl \
locale-krfb-nn \
locale-krfb-oc \
locale-krfb-pa \
locale-krfb-pl \
locale-krfb-pt \
locale-krfb-pt-BR \
locale-krfb-ro \
locale-krfb-ru \
locale-krfb-sk \
locale-krfb-sl \
locale-krfb-sq \
locale-krfb-sr \
locale-krfb-sr@ijekavian \
locale-krfb-sr@ijekavianlatin \
locale-krfb-sr@latin \
locale-krfb-sv \
locale-krfb-ta \
locale-krfb-th \
locale-krfb-tr \
locale-krfb-ug \
locale-krfb-uk \
locale-krfb-vi \
locale-krfb-zh-CN \
locale-krfb-zh-TW"

RDEPENDS:${PN} += "krfb"

inherit rpm
