SUMMARY = "Translations for package dasher"
DESCRIPTION = "Provides translations for the 'dasher' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.0"

RPM_NAME = "dasher-lang-5.0.0-1.8.noarch.rpm"
RPM_HASH = "c0902c9f4459b2f1e1b2a58f4ec1d0cb8a4405240ba7cbe3221560892cffcec67d92ba8a998c4ef2d144c535746993ccd35b0222d9dc56148b2b448cf0891f7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dasher-lang \
dasher-lang-all \
locale-dasher-af \
locale-dasher-ar \
locale-dasher-as \
locale-dasher-ast \
locale-dasher-az \
locale-dasher-be \
locale-dasher-be@latin \
locale-dasher-bg \
locale-dasher-bn \
locale-dasher-bn-IN \
locale-dasher-bs \
locale-dasher-ca \
locale-dasher-ca@valencia \
locale-dasher-cs \
locale-dasher-cy \
locale-dasher-da \
locale-dasher-de \
locale-dasher-dz \
locale-dasher-el \
locale-dasher-en-CA \
locale-dasher-en-GB \
locale-dasher-en@shaw \
locale-dasher-es \
locale-dasher-et \
locale-dasher-eu \
locale-dasher-fa \
locale-dasher-fi \
locale-dasher-fr \
locale-dasher-ga \
locale-dasher-gl \
locale-dasher-gu \
locale-dasher-he \
locale-dasher-hi \
locale-dasher-hr \
locale-dasher-hu \
locale-dasher-id \
locale-dasher-it \
locale-dasher-ja \
locale-dasher-ka \
locale-dasher-kk \
locale-dasher-kn \
locale-dasher-ko \
locale-dasher-lt \
locale-dasher-lv \
locale-dasher-mai \
locale-dasher-mk \
locale-dasher-ml \
locale-dasher-mr \
locale-dasher-ms \
locale-dasher-nb \
locale-dasher-ne \
locale-dasher-nl \
locale-dasher-nn \
locale-dasher-oc \
locale-dasher-or \
locale-dasher-pa \
locale-dasher-pl \
locale-dasher-pt \
locale-dasher-pt-BR \
locale-dasher-ro \
locale-dasher-ru \
locale-dasher-si \
locale-dasher-sk \
locale-dasher-sl \
locale-dasher-sq \
locale-dasher-sr \
locale-dasher-sr@latin \
locale-dasher-sv \
locale-dasher-ta \
locale-dasher-te \
locale-dasher-th \
locale-dasher-tr \
locale-dasher-ug \
locale-dasher-uk \
locale-dasher-vi \
locale-dasher-zh-CN \
locale-dasher-zh-HK \
locale-dasher-zh-TW"

RDEPENDS:${PN} += "dasher"

inherit rpm
