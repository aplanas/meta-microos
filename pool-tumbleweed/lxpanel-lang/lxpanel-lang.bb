SUMMARY = "Translations for package lxpanel"
DESCRIPTION = "Provides translations for the 'lxpanel' package."
LICENSE = "GPL-2.0-only"

PV = "0.10.1"

RPM_NAME = "lxpanel-lang-0.10.1-1.11.noarch.rpm"
RPM_HASH = "867dc11f2bc4473687c6a48e6c5824315e9f5618d53ba6dbd58cbdf744b51451097a6a20035375d7c13227ebb49fdf8d946cef3d91d5c55ac5fac2cc053283cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-lxpanel-af \
locale-lxpanel-ar \
locale-lxpanel-be \
locale-lxpanel-bg \
locale-lxpanel-bn \
locale-lxpanel-bn-IN \
locale-lxpanel-ca \
locale-lxpanel-cs \
locale-lxpanel-da \
locale-lxpanel-de \
locale-lxpanel-el \
locale-lxpanel-en-GB \
locale-lxpanel-es \
locale-lxpanel-et \
locale-lxpanel-eu \
locale-lxpanel-fa \
locale-lxpanel-fi \
locale-lxpanel-fr \
locale-lxpanel-gl \
locale-lxpanel-he \
locale-lxpanel-hr \
locale-lxpanel-hu \
locale-lxpanel-id \
locale-lxpanel-is \
locale-lxpanel-it \
locale-lxpanel-ja \
locale-lxpanel-kk \
locale-lxpanel-km \
locale-lxpanel-ko \
locale-lxpanel-lt \
locale-lxpanel-lv \
locale-lxpanel-ml \
locale-lxpanel-ms \
locale-lxpanel-nb \
locale-lxpanel-nl \
locale-lxpanel-nn \
locale-lxpanel-pa \
locale-lxpanel-pl \
locale-lxpanel-pt \
locale-lxpanel-pt-BR \
locale-lxpanel-ro \
locale-lxpanel-ru \
locale-lxpanel-sk \
locale-lxpanel-sl \
locale-lxpanel-sr \
locale-lxpanel-sr@latin \
locale-lxpanel-sv \
locale-lxpanel-te \
locale-lxpanel-th \
locale-lxpanel-tr \
locale-lxpanel-ug \
locale-lxpanel-uk \
locale-lxpanel-vi \
locale-lxpanel-zh-CN \
locale-lxpanel-zh-HK \
locale-lxpanel-zh-TW \
lxpanel-lang \
lxpanel-lang-all"

RDEPENDS:${PN} += "lxpanel"

inherit rpm
