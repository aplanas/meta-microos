SUMMARY = "Translations for package kpat"
DESCRIPTION = "Provides translations for the 'kpat' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kpat-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "e3dc0f3fc3f9c5388ef385a9e56db440683c519670ada06ca487d1e8bc89bcceb31108af15b65df16cbc383741fd458059cd0f8a540b983fbb1e8a726a871522"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kpat-lang \
kpat-lang-all \
locale-kpat-af \
locale-kpat-ar \
locale-kpat-be \
locale-kpat-bg \
locale-kpat-br \
locale-kpat-bs \
locale-kpat-ca \
locale-kpat-ca@valencia \
locale-kpat-cs \
locale-kpat-cy \
locale-kpat-da \
locale-kpat-de \
locale-kpat-el \
locale-kpat-en-GB \
locale-kpat-eo \
locale-kpat-es \
locale-kpat-et \
locale-kpat-eu \
locale-kpat-fa \
locale-kpat-fi \
locale-kpat-fr \
locale-kpat-ga \
locale-kpat-gl \
locale-kpat-he \
locale-kpat-hi \
locale-kpat-hr \
locale-kpat-hu \
locale-kpat-id \
locale-kpat-is \
locale-kpat-it \
locale-kpat-ja \
locale-kpat-ka \
locale-kpat-kk \
locale-kpat-km \
locale-kpat-ko \
locale-kpat-lt \
locale-kpat-lv \
locale-kpat-mai \
locale-kpat-mk \
locale-kpat-ml \
locale-kpat-mr \
locale-kpat-ms \
locale-kpat-nb \
locale-kpat-nds \
locale-kpat-ne \
locale-kpat-nl \
locale-kpat-nn \
locale-kpat-oc \
locale-kpat-pa \
locale-kpat-pl \
locale-kpat-pt \
locale-kpat-pt-BR \
locale-kpat-ro \
locale-kpat-ru \
locale-kpat-sk \
locale-kpat-sl \
locale-kpat-sq \
locale-kpat-sr \
locale-kpat-sr@ijekavian \
locale-kpat-sr@ijekavianlatin \
locale-kpat-sr@latin \
locale-kpat-sv \
locale-kpat-ta \
locale-kpat-th \
locale-kpat-tr \
locale-kpat-ug \
locale-kpat-uk \
locale-kpat-wa \
locale-kpat-zh-CN \
locale-kpat-zh-TW"

RDEPENDS:${PN} += "kpat"

inherit rpm
