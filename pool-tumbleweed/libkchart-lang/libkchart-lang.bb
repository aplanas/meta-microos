SUMMARY = "Translations for package libkchart"
DESCRIPTION = "Provides translations for the 'libkchart' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libkchart-lang-2.8.0-1.15.noarch.rpm"
RPM_HASH = "433ed1ec85251d6cff4156f41d1e47b23d9770188d95b49be4174995867015eab396f527abaa92ae64eeb1425f5c8e9b5c7ade17fcbe7bc0f601a8ddca350dea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkchart-lang \
libkchart-lang-all \
locale-libkchart-ar \
locale-libkchart-ast \
locale-libkchart-bs \
locale-libkchart-ca \
locale-libkchart-ca@valencia \
locale-libkchart-cs \
locale-libkchart-de \
locale-libkchart-el \
locale-libkchart-en-GB \
locale-libkchart-es \
locale-libkchart-et \
locale-libkchart-eu \
locale-libkchart-fi \
locale-libkchart-fr \
locale-libkchart-gl \
locale-libkchart-it \
locale-libkchart-ko \
locale-libkchart-nl \
locale-libkchart-nn \
locale-libkchart-pl \
locale-libkchart-pt \
locale-libkchart-pt-BR \
locale-libkchart-ro \
locale-libkchart-ru \
locale-libkchart-sk \
locale-libkchart-sv \
locale-libkchart-tr \
locale-libkchart-uk \
locale-libkchart-zh-CN \
locale-libkchart-zh-TW"

RDEPENDS:${PN} += "libkchart"

inherit rpm
