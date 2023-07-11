SUMMARY = "Translations for package safeeyes"
DESCRIPTION = "Provides translations for the 'safeeyes' package."
LICENSE = "GPL-3.0-only"

PV = "2.1.6"

RPM_NAME = "safeeyes-lang-2.1.6-1.1.noarch.rpm"
RPM_HASH = "79a5b2b36c434566fbb0c8c5a108f31b4d945ecc06a9cf21c8a8ce1bae251f60943247f539e6e6b7191729d166f268aa201db0e183d2e03daba8197170422575"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-safeeyes-ar \
locale-safeeyes-bg \
locale-safeeyes-ca \
locale-safeeyes-cs \
locale-safeeyes-da \
locale-safeeyes-de \
locale-safeeyes-en-US \
locale-safeeyes-eo \
locale-safeeyes-es \
locale-safeeyes-et \
locale-safeeyes-eu \
locale-safeeyes-fa \
locale-safeeyes-fr \
locale-safeeyes-he \
locale-safeeyes-hi \
locale-safeeyes-hu \
locale-safeeyes-id \
locale-safeeyes-it \
locale-safeeyes-kn \
locale-safeeyes-ko \
locale-safeeyes-lt \
locale-safeeyes-lv \
locale-safeeyes-mk \
locale-safeeyes-mr \
locale-safeeyes-nb \
locale-safeeyes-nl \
locale-safeeyes-pl \
locale-safeeyes-pt \
locale-safeeyes-pt-BR \
locale-safeeyes-ru \
locale-safeeyes-sk \
locale-safeeyes-sr \
locale-safeeyes-sv \
locale-safeeyes-ta \
locale-safeeyes-tr \
locale-safeeyes-ug \
locale-safeeyes-uk \
locale-safeeyes-uz-Latn \
locale-safeeyes-vi \
locale-safeeyes-zh-CN \
locale-safeeyes-zh-TW \
safeeyes-lang \
safeeyes-lang-all"

RDEPENDS:${PN} += "safeeyes"

inherit rpm
