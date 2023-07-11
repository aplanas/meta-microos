SUMMARY = "Translations for package sushi"
DESCRIPTION = "Provides translations for the 'sushi' package."
LICENSE = "SUSE-GPL-2.0-with-plugin-exception"

PV = "44.2"

RPM_NAME = "sushi-lang-44.2-1.1.noarch.rpm"
RPM_HASH = "fe956ccd2c0b50c3a4689e90d723ebaf62c3d6a5cdf3c23f1c1bf3d6d2ca19d7e1724cf6e81ccff722ff92355fd2ab86e0c0582eb7ce4111e19f81892046a945"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-sushi-af \
locale-sushi-ar \
locale-sushi-as \
locale-sushi-ast \
locale-sushi-be \
locale-sushi-bg \
locale-sushi-bn-IN \
locale-sushi-bs \
locale-sushi-ca \
locale-sushi-ca@valencia \
locale-sushi-cs \
locale-sushi-da \
locale-sushi-de \
locale-sushi-el \
locale-sushi-en-GB \
locale-sushi-eo \
locale-sushi-es \
locale-sushi-et \
locale-sushi-eu \
locale-sushi-fa \
locale-sushi-fi \
locale-sushi-fr \
locale-sushi-fur \
locale-sushi-gd \
locale-sushi-gl \
locale-sushi-gu \
locale-sushi-he \
locale-sushi-hi \
locale-sushi-hr \
locale-sushi-hu \
locale-sushi-id \
locale-sushi-is \
locale-sushi-it \
locale-sushi-ja \
locale-sushi-ka \
locale-sushi-kk \
locale-sushi-kn \
locale-sushi-ko \
locale-sushi-lt \
locale-sushi-lv \
locale-sushi-ml \
locale-sushi-mr \
locale-sushi-ms \
locale-sushi-nb \
locale-sushi-ne \
locale-sushi-nl \
locale-sushi-oc \
locale-sushi-or \
locale-sushi-pa \
locale-sushi-pl \
locale-sushi-pt \
locale-sushi-pt-BR \
locale-sushi-ro \
locale-sushi-ru \
locale-sushi-sk \
locale-sushi-sl \
locale-sushi-sr \
locale-sushi-sr@latin \
locale-sushi-sv \
locale-sushi-ta \
locale-sushi-te \
locale-sushi-th \
locale-sushi-tr \
locale-sushi-ug \
locale-sushi-uk \
locale-sushi-vi \
locale-sushi-zh-CN \
locale-sushi-zh-HK \
locale-sushi-zh-TW \
sushi-lang \
sushi-lang-all"

RDEPENDS:${PN} += "sushi"

inherit rpm
