SUMMARY = "Translations for package kdenetwork-filesharing"
DESCRIPTION = "Provides translations for the 'kdenetwork-filesharing' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kdenetwork-filesharing-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "f1a20fa4ea951e0eae55075c9add5222d79a637c99d36421580bef1699580117b43282f8e667fdaadc3c33eaec7111e7ee9587914de550bce65aae2a07b94d32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdenetwork-filesharing-lang \
kdenetwork-filesharing-lang-all \
locale-kdenetwork-filesharing-ar \
locale-kdenetwork-filesharing-az \
locale-kdenetwork-filesharing-be \
locale-kdenetwork-filesharing-bg \
locale-kdenetwork-filesharing-br \
locale-kdenetwork-filesharing-bs \
locale-kdenetwork-filesharing-ca \
locale-kdenetwork-filesharing-ca@valencia \
locale-kdenetwork-filesharing-cs \
locale-kdenetwork-filesharing-cy \
locale-kdenetwork-filesharing-da \
locale-kdenetwork-filesharing-de \
locale-kdenetwork-filesharing-el \
locale-kdenetwork-filesharing-en-GB \
locale-kdenetwork-filesharing-eo \
locale-kdenetwork-filesharing-es \
locale-kdenetwork-filesharing-et \
locale-kdenetwork-filesharing-eu \
locale-kdenetwork-filesharing-fa \
locale-kdenetwork-filesharing-fi \
locale-kdenetwork-filesharing-fr \
locale-kdenetwork-filesharing-ga \
locale-kdenetwork-filesharing-gl \
locale-kdenetwork-filesharing-he \
locale-kdenetwork-filesharing-hi \
locale-kdenetwork-filesharing-hr \
locale-kdenetwork-filesharing-hu \
locale-kdenetwork-filesharing-ia \
locale-kdenetwork-filesharing-id \
locale-kdenetwork-filesharing-is \
locale-kdenetwork-filesharing-it \
locale-kdenetwork-filesharing-ja \
locale-kdenetwork-filesharing-ka \
locale-kdenetwork-filesharing-kk \
locale-kdenetwork-filesharing-km \
locale-kdenetwork-filesharing-ko \
locale-kdenetwork-filesharing-lt \
locale-kdenetwork-filesharing-lv \
locale-kdenetwork-filesharing-mai \
locale-kdenetwork-filesharing-mk \
locale-kdenetwork-filesharing-mr \
locale-kdenetwork-filesharing-ms \
locale-kdenetwork-filesharing-nb \
locale-kdenetwork-filesharing-nds \
locale-kdenetwork-filesharing-ne \
locale-kdenetwork-filesharing-nl \
locale-kdenetwork-filesharing-nn \
locale-kdenetwork-filesharing-oc \
locale-kdenetwork-filesharing-pa \
locale-kdenetwork-filesharing-pl \
locale-kdenetwork-filesharing-pt \
locale-kdenetwork-filesharing-pt-BR \
locale-kdenetwork-filesharing-ro \
locale-kdenetwork-filesharing-ru \
locale-kdenetwork-filesharing-sk \
locale-kdenetwork-filesharing-sl \
locale-kdenetwork-filesharing-sq \
locale-kdenetwork-filesharing-sr \
locale-kdenetwork-filesharing-sr@ijekavian \
locale-kdenetwork-filesharing-sr@ijekavianlatin \
locale-kdenetwork-filesharing-sr@latin \
locale-kdenetwork-filesharing-sv \
locale-kdenetwork-filesharing-ta \
locale-kdenetwork-filesharing-th \
locale-kdenetwork-filesharing-tr \
locale-kdenetwork-filesharing-ug \
locale-kdenetwork-filesharing-uk \
locale-kdenetwork-filesharing-vi \
locale-kdenetwork-filesharing-zh-CN \
locale-kdenetwork-filesharing-zh-HK \
locale-kdenetwork-filesharing-zh-TW"

RDEPENDS:${PN} += "kdenetwork-filesharing"

inherit rpm
