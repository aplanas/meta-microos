SUMMARY = "Translations for package kio_audiocd"
DESCRIPTION = "Provides translations for the 'kio_audiocd' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kio_audiocd-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "e42ef3ea6ec18e7dc4da936da42987fd5829ef5f98342345d7ad0ab015832a329fcded93a9a88aa0311238fb722082d2289950264819a851d8b850214e8e3476"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kio-audiocd-lang \
kio-audiocd-lang-all \
locale-kio-audiocd-af \
locale-kio-audiocd-ar \
locale-kio-audiocd-az \
locale-kio-audiocd-be \
locale-kio-audiocd-bg \
locale-kio-audiocd-bn \
locale-kio-audiocd-br \
locale-kio-audiocd-bs \
locale-kio-audiocd-ca \
locale-kio-audiocd-ca@valencia \
locale-kio-audiocd-cs \
locale-kio-audiocd-cy \
locale-kio-audiocd-da \
locale-kio-audiocd-de \
locale-kio-audiocd-el \
locale-kio-audiocd-en-GB \
locale-kio-audiocd-eo \
locale-kio-audiocd-es \
locale-kio-audiocd-et \
locale-kio-audiocd-eu \
locale-kio-audiocd-fa \
locale-kio-audiocd-fi \
locale-kio-audiocd-fr \
locale-kio-audiocd-ga \
locale-kio-audiocd-gl \
locale-kio-audiocd-he \
locale-kio-audiocd-hi \
locale-kio-audiocd-hr \
locale-kio-audiocd-hu \
locale-kio-audiocd-ia \
locale-kio-audiocd-id \
locale-kio-audiocd-is \
locale-kio-audiocd-it \
locale-kio-audiocd-ja \
locale-kio-audiocd-ka \
locale-kio-audiocd-kk \
locale-kio-audiocd-km \
locale-kio-audiocd-ko \
locale-kio-audiocd-lt \
locale-kio-audiocd-lv \
locale-kio-audiocd-mk \
locale-kio-audiocd-mr \
locale-kio-audiocd-ms \
locale-kio-audiocd-nb \
locale-kio-audiocd-nds \
locale-kio-audiocd-ne \
locale-kio-audiocd-nl \
locale-kio-audiocd-nn \
locale-kio-audiocd-oc \
locale-kio-audiocd-pa \
locale-kio-audiocd-pl \
locale-kio-audiocd-pt \
locale-kio-audiocd-pt-BR \
locale-kio-audiocd-ro \
locale-kio-audiocd-ru \
locale-kio-audiocd-sk \
locale-kio-audiocd-sl \
locale-kio-audiocd-sq \
locale-kio-audiocd-sr \
locale-kio-audiocd-sr@ijekavian \
locale-kio-audiocd-sr@ijekavianlatin \
locale-kio-audiocd-sr@latin \
locale-kio-audiocd-sv \
locale-kio-audiocd-ta \
locale-kio-audiocd-th \
locale-kio-audiocd-tr \
locale-kio-audiocd-ug \
locale-kio-audiocd-uk \
locale-kio-audiocd-vi \
locale-kio-audiocd-wa \
locale-kio-audiocd-zh-CN \
locale-kio-audiocd-zh-HK \
locale-kio-audiocd-zh-TW"

RDEPENDS:${PN} += "kio-audiocd"

inherit rpm
