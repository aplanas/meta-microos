SUMMARY = "Translations for package libkgantt"
DESCRIPTION = "Provides translations for the 'libkgantt' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libkgantt-lang-2.8.0-1.15.noarch.rpm"
RPM_HASH = "1aed0c9ac80472257f800ee6e25e798d7654b79256a3c7dedfa854f613fe77f05f4c38da56e76e605bee1fde44c60dcdd69264e07cec6f6ea13c75cabac4f280"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkgantt-lang \
libkgantt-lang-all \
locale-libkgantt-ar \
locale-libkgantt-ast \
locale-libkgantt-bg \
locale-libkgantt-bs \
locale-libkgantt-ca \
locale-libkgantt-ca@valencia \
locale-libkgantt-cs \
locale-libkgantt-da \
locale-libkgantt-de \
locale-libkgantt-el \
locale-libkgantt-en-GB \
locale-libkgantt-es \
locale-libkgantt-et \
locale-libkgantt-eu \
locale-libkgantt-fi \
locale-libkgantt-fr \
locale-libkgantt-gl \
locale-libkgantt-it \
locale-libkgantt-ko \
locale-libkgantt-nl \
locale-libkgantt-nn \
locale-libkgantt-pl \
locale-libkgantt-pt \
locale-libkgantt-pt-BR \
locale-libkgantt-ru \
locale-libkgantt-sk \
locale-libkgantt-sv \
locale-libkgantt-tr \
locale-libkgantt-uk \
locale-libkgantt-zh-CN \
locale-libkgantt-zh-TW"

RDEPENDS:${PN} += "libkgantt"

inherit rpm
