SUMMARY = "Translations for package libkcddb"
DESCRIPTION = "Provides translations for the 'libkcddb' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libkcddb-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "bcefc54dbcf48f54285caa4b240cb84ce08b3d56a2a3e4f9c93c44426a799e537538877b2f9b02ac8c76ccdea5544af978c3cd9bafec49b9a2a3a557f0015068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkcddb-lang \
libkcddb-lang-all \
locale-libkcddb-ar \
locale-libkcddb-be \
locale-libkcddb-bg \
locale-libkcddb-br \
locale-libkcddb-bs \
locale-libkcddb-ca \
locale-libkcddb-ca@valencia \
locale-libkcddb-cs \
locale-libkcddb-cy \
locale-libkcddb-da \
locale-libkcddb-de \
locale-libkcddb-el \
locale-libkcddb-en-GB \
locale-libkcddb-eo \
locale-libkcddb-es \
locale-libkcddb-et \
locale-libkcddb-eu \
locale-libkcddb-fa \
locale-libkcddb-fi \
locale-libkcddb-fr \
locale-libkcddb-ga \
locale-libkcddb-gl \
locale-libkcddb-he \
locale-libkcddb-hi \
locale-libkcddb-hr \
locale-libkcddb-hu \
locale-libkcddb-ia \
locale-libkcddb-is \
locale-libkcddb-it \
locale-libkcddb-ja \
locale-libkcddb-ka \
locale-libkcddb-kk \
locale-libkcddb-km \
locale-libkcddb-ko \
locale-libkcddb-lt \
locale-libkcddb-lv \
locale-libkcddb-mk \
locale-libkcddb-mr \
locale-libkcddb-ms \
locale-libkcddb-nb \
locale-libkcddb-nds \
locale-libkcddb-ne \
locale-libkcddb-nl \
locale-libkcddb-nn \
locale-libkcddb-oc \
locale-libkcddb-pa \
locale-libkcddb-pl \
locale-libkcddb-pt \
locale-libkcddb-pt-BR \
locale-libkcddb-ro \
locale-libkcddb-ru \
locale-libkcddb-sk \
locale-libkcddb-sl \
locale-libkcddb-sq \
locale-libkcddb-sr \
locale-libkcddb-sr@ijekavian \
locale-libkcddb-sr@ijekavianlatin \
locale-libkcddb-sr@latin \
locale-libkcddb-sv \
locale-libkcddb-ta \
locale-libkcddb-th \
locale-libkcddb-tr \
locale-libkcddb-ug \
locale-libkcddb-uk \
locale-libkcddb-zh-CN \
locale-libkcddb-zh-HK \
locale-libkcddb-zh-TW"

RDEPENDS:${PN} += "libkcddb"

inherit rpm
