SUMMARY = "Translations for package klettres"
DESCRIPTION = "Provides translations for the 'klettres' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "klettres-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "c9d2db1e0cd23ed01a14d681971720996a5e4a9e46a56aea90b741f75d76c11f9500323b6770db8103f3764152a39e9721190cd0f0e36a8d9b724c88726ca507"
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
