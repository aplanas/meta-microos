SUMMARY = "Translations for package lxinput"
DESCRIPTION = "Provides translations for the 'lxinput' package."
LICENSE = "GPL-2.0"

PV = "0.3.5"

RPM_NAME = "lxinput-lang-0.3.5-1.27.noarch.rpm"
RPM_HASH = "7021ce6a6c977a11c201a79c9da802ea73d4569815864882b00b5874d635877373fa893946e1433d2eef0e2fb1f9b9c8e121ffc36e97f04d44bd7bc42058d5b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-lxinput-af \
locale-lxinput-ar \
locale-lxinput-ast \
locale-lxinput-be \
locale-lxinput-bg \
locale-lxinput-bn \
locale-lxinput-bn-IN \
locale-lxinput-ca \
locale-lxinput-cs \
locale-lxinput-da \
locale-lxinput-de \
locale-lxinput-el \
locale-lxinput-en-GB \
locale-lxinput-eo \
locale-lxinput-es \
locale-lxinput-et \
locale-lxinput-eu \
locale-lxinput-fa \
locale-lxinput-fi \
locale-lxinput-fr \
locale-lxinput-gl \
locale-lxinput-he \
locale-lxinput-hr \
locale-lxinput-hu \
locale-lxinput-id \
locale-lxinput-is \
locale-lxinput-it \
locale-lxinput-ja \
locale-lxinput-kk \
locale-lxinput-ko \
locale-lxinput-lt \
locale-lxinput-ml \
locale-lxinput-ms \
locale-lxinput-nb \
locale-lxinput-nl \
locale-lxinput-nn \
locale-lxinput-pa \
locale-lxinput-pl \
locale-lxinput-pt \
locale-lxinput-pt-BR \
locale-lxinput-ro \
locale-lxinput-ru \
locale-lxinput-si \
locale-lxinput-sk \
locale-lxinput-sl \
locale-lxinput-sr \
locale-lxinput-sr@latin \
locale-lxinput-sv \
locale-lxinput-te \
locale-lxinput-th \
locale-lxinput-tr \
locale-lxinput-ug \
locale-lxinput-uk \
locale-lxinput-vi \
locale-lxinput-zh-CN \
locale-lxinput-zh-TW \
lxinput-lang \
lxinput-lang-all"

RDEPENDS:${PN} += "lxinput"

inherit rpm
