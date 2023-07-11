SUMMARY = "Translations for package wdiff"
DESCRIPTION = "Provides translations for the 'wdiff' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.2"

RPM_NAME = "wdiff-lang-1.2.2-8.8.noarch.rpm"
RPM_HASH = "dec115facefe53e1b27f64142345fb713879776b5cd0c9e6e97ce6fdea04d0f26d9bb658c86a2a2a88117de972b3934adf4e96a0db2a56858c8847dc14be5f66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-wdiff-af \
locale-wdiff-be \
locale-wdiff-bg \
locale-wdiff-ca \
locale-wdiff-cs \
locale-wdiff-da \
locale-wdiff-de \
locale-wdiff-el \
locale-wdiff-en-GB \
locale-wdiff-en@boldquot \
locale-wdiff-en@quot \
locale-wdiff-eo \
locale-wdiff-es \
locale-wdiff-et \
locale-wdiff-eu \
locale-wdiff-fi \
locale-wdiff-fr \
locale-wdiff-ga \
locale-wdiff-gl \
locale-wdiff-hu \
locale-wdiff-id \
locale-wdiff-it \
locale-wdiff-ja \
locale-wdiff-ko \
locale-wdiff-ms \
locale-wdiff-nb \
locale-wdiff-nl \
locale-wdiff-pl \
locale-wdiff-pt \
locale-wdiff-pt-BR \
locale-wdiff-ro \
locale-wdiff-ru \
locale-wdiff-sk \
locale-wdiff-sl \
locale-wdiff-sr \
locale-wdiff-sv \
locale-wdiff-tr \
locale-wdiff-uk \
locale-wdiff-vi \
locale-wdiff-zh-CN \
locale-wdiff-zh-TW \
wdiff-lang \
wdiff-lang-all"

RDEPENDS:${PN} += "wdiff"

inherit rpm
