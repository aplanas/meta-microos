SUMMARY = "Translations for package libkcddb"
DESCRIPTION = "Provides translations for the 'libkcddb' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libkcddb-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "a53de527459f01fda5ed43ab64b1205d3286e2c3cc0e27c0d64179ce79d78ef13a1aff8ac9585152d6f342c59b1281b6489a3d3f5a3f0412022a36db9f2513b4"
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
