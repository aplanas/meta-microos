SUMMARY = "Translations for package libnma"
DESCRIPTION = "Provides translations for the 'libnma' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "libnma-lang-1.10.6-1.3.noarch.rpm"
RPM_HASH = "3dc44bbe7fe6a15148013caa4ae5fd9a109cc87983e8316c4db016e1b610b7c064dddf9286ddcf578b8802aaef806ee1ab36ec5a6d30f12cd97304b04d707494"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libnma-lang \
libnma-lang-all \
locale-libnma-af \
locale-libnma-ar \
locale-libnma-as \
locale-libnma-ast \
locale-libnma-be \
locale-libnma-be@latin \
locale-libnma-bg \
locale-libnma-bn-IN \
locale-libnma-bs \
locale-libnma-ca \
locale-libnma-ca@valencia \
locale-libnma-cs \
locale-libnma-da \
locale-libnma-de \
locale-libnma-dz \
locale-libnma-el \
locale-libnma-en-CA \
locale-libnma-en-GB \
locale-libnma-eo \
locale-libnma-es \
locale-libnma-et \
locale-libnma-eu \
locale-libnma-fa \
locale-libnma-fi \
locale-libnma-fr \
locale-libnma-gd \
locale-libnma-gl \
locale-libnma-gu \
locale-libnma-he \
locale-libnma-hi \
locale-libnma-hr \
locale-libnma-hu \
locale-libnma-id \
locale-libnma-is \
locale-libnma-it \
locale-libnma-ja \
locale-libnma-ka \
locale-libnma-kk \
locale-libnma-km \
locale-libnma-kn \
locale-libnma-ko \
locale-libnma-lt \
locale-libnma-lv \
locale-libnma-mk \
locale-libnma-ml \
locale-libnma-mr \
locale-libnma-ms \
locale-libnma-nb \
locale-libnma-ne \
locale-libnma-nl \
locale-libnma-nn \
locale-libnma-oc \
locale-libnma-or \
locale-libnma-pa \
locale-libnma-pl \
locale-libnma-pt \
locale-libnma-pt-BR \
locale-libnma-ro \
locale-libnma-ru \
locale-libnma-sk \
locale-libnma-sl \
locale-libnma-sq \
locale-libnma-sr \
locale-libnma-sr@latin \
locale-libnma-sv \
locale-libnma-ta \
locale-libnma-te \
locale-libnma-th \
locale-libnma-tr \
locale-libnma-ug \
locale-libnma-uk \
locale-libnma-vi \
locale-libnma-wa \
locale-libnma-zh-CN \
locale-libnma-zh-HK \
locale-libnma-zh-TW"

RDEPENDS:${PN} += "libnma"

inherit rpm
