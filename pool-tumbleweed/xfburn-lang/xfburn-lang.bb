SUMMARY = "Translations for package xfburn"
DESCRIPTION = "Provides translations for the 'xfburn' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.0"

RPM_NAME = "xfburn-lang-0.7.0-1.3.noarch.rpm"
RPM_HASH = "6d24b15c13e6e37a434628c0fa4e23606fdc067f1d96bd38fa4cfc9265af4435469d74f9a54958ebffe3af2dd4b75cbe6781ee4de53c0daeb41812806e9fe250"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfburn-ar \
locale-xfburn-ast \
locale-xfburn-be \
locale-xfburn-bg \
locale-xfburn-ca \
locale-xfburn-cs \
locale-xfburn-da \
locale-xfburn-de \
locale-xfburn-el \
locale-xfburn-en-AU \
locale-xfburn-en-GB \
locale-xfburn-es \
locale-xfburn-et \
locale-xfburn-eu \
locale-xfburn-fi \
locale-xfburn-fr \
locale-xfburn-gl \
locale-xfburn-he \
locale-xfburn-hr \
locale-xfburn-hu \
locale-xfburn-id \
locale-xfburn-is \
locale-xfburn-it \
locale-xfburn-ja \
locale-xfburn-kk \
locale-xfburn-ko \
locale-xfburn-lt \
locale-xfburn-lv \
locale-xfburn-ms \
locale-xfburn-nb \
locale-xfburn-nl \
locale-xfburn-nn \
locale-xfburn-oc \
locale-xfburn-pa \
locale-xfburn-pl \
locale-xfburn-pt \
locale-xfburn-pt-BR \
locale-xfburn-ru \
locale-xfburn-si \
locale-xfburn-sk \
locale-xfburn-sl \
locale-xfburn-sq \
locale-xfburn-sr \
locale-xfburn-sv \
locale-xfburn-te \
locale-xfburn-th \
locale-xfburn-tr \
locale-xfburn-ug \
locale-xfburn-uk \
locale-xfburn-vi \
locale-xfburn-zh-CN \
locale-xfburn-zh-TW \
xfburn-lang \
xfburn-lang-all"

RDEPENDS:${PN} += "xfburn"

inherit rpm
