SUMMARY = "Translations for package fprintd"
DESCRIPTION = "Provides translations for the 'fprintd' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.94.2"

RPM_NAME = "fprintd-lang-1.94.2-2.5.noarch.rpm"
RPM_HASH = "22bfc1e63e3a24cc84f7286c5338d8b4ae313eca4d3f5985db4fd129cd48fde349bcfe3419446e750ecdcdf18469837b461fdcd2ab0296d0c9060b67a481ac07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fprintd-lang \
fprintd-lang-all \
locale-fprintd-af \
locale-fprintd-ar \
locale-fprintd-as \
locale-fprintd-ast \
locale-fprintd-az \
locale-fprintd-be \
locale-fprintd-bg \
locale-fprintd-bn-IN \
locale-fprintd-ca \
locale-fprintd-ca@valencia \
locale-fprintd-cs \
locale-fprintd-cy \
locale-fprintd-da \
locale-fprintd-de \
locale-fprintd-el \
locale-fprintd-en-GB \
locale-fprintd-eo \
locale-fprintd-es \
locale-fprintd-et \
locale-fprintd-eu \
locale-fprintd-fa \
locale-fprintd-fi \
locale-fprintd-fr \
locale-fprintd-fur \
locale-fprintd-ga \
locale-fprintd-gl \
locale-fprintd-gu \
locale-fprintd-he \
locale-fprintd-hi \
locale-fprintd-hr \
locale-fprintd-hu \
locale-fprintd-ia \
locale-fprintd-id \
locale-fprintd-it \
locale-fprintd-ja \
locale-fprintd-ka \
locale-fprintd-kk \
locale-fprintd-kn \
locale-fprintd-ko \
locale-fprintd-lt \
locale-fprintd-lv \
locale-fprintd-ml \
locale-fprintd-mr \
locale-fprintd-ms \
locale-fprintd-nb \
locale-fprintd-nl \
locale-fprintd-nn \
locale-fprintd-oc \
locale-fprintd-or \
locale-fprintd-pa \
locale-fprintd-pl \
locale-fprintd-pt \
locale-fprintd-pt-BR \
locale-fprintd-ro \
locale-fprintd-ru \
locale-fprintd-sk \
locale-fprintd-sl \
locale-fprintd-sq \
locale-fprintd-sr \
locale-fprintd-sr@latin \
locale-fprintd-sv \
locale-fprintd-ta \
locale-fprintd-te \
locale-fprintd-th \
locale-fprintd-tr \
locale-fprintd-uk \
locale-fprintd-vi \
locale-fprintd-wa \
locale-fprintd-zh-CN \
locale-fprintd-zh-HK \
locale-fprintd-zh-TW"

RDEPENDS:${PN} += "fprintd"

inherit rpm
