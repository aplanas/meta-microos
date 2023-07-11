SUMMARY = "Translations for package libksieve"
DESCRIPTION = "Provides translations for the 'libksieve' package."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libksieve-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "136ba3511d9b79a3e09b8a0e74628e73f29c38ac642c8f96be2c59aa07e0a6edf3d0c28cca7267f8cf3bda89c299c54b2c65466d55912180d19af81856548d2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libksieve-lang \
libksieve-lang-all \
locale-libksieve-ar \
locale-libksieve-be \
locale-libksieve-bg \
locale-libksieve-br \
locale-libksieve-bs \
locale-libksieve-ca \
locale-libksieve-ca@valencia \
locale-libksieve-cs \
locale-libksieve-cy \
locale-libksieve-da \
locale-libksieve-de \
locale-libksieve-el \
locale-libksieve-en-GB \
locale-libksieve-eo \
locale-libksieve-es \
locale-libksieve-et \
locale-libksieve-eu \
locale-libksieve-fa \
locale-libksieve-fi \
locale-libksieve-fr \
locale-libksieve-ga \
locale-libksieve-gl \
locale-libksieve-hi \
locale-libksieve-hu \
locale-libksieve-ia \
locale-libksieve-is \
locale-libksieve-it \
locale-libksieve-ja \
locale-libksieve-ka \
locale-libksieve-kk \
locale-libksieve-km \
locale-libksieve-ko \
locale-libksieve-lt \
locale-libksieve-lv \
locale-libksieve-mk \
locale-libksieve-mr \
locale-libksieve-ms \
locale-libksieve-nb \
locale-libksieve-nds \
locale-libksieve-ne \
locale-libksieve-nl \
locale-libksieve-nn \
locale-libksieve-pa \
locale-libksieve-pl \
locale-libksieve-pt \
locale-libksieve-pt-BR \
locale-libksieve-ro \
locale-libksieve-ru \
locale-libksieve-sk \
locale-libksieve-sl \
locale-libksieve-sq \
locale-libksieve-sr \
locale-libksieve-sr@ijekavian \
locale-libksieve-sr@ijekavianlatin \
locale-libksieve-sr@latin \
locale-libksieve-sv \
locale-libksieve-ta \
locale-libksieve-tr \
locale-libksieve-ug \
locale-libksieve-uk \
locale-libksieve-zh-CN \
locale-libksieve-zh-TW"

RDEPENDS:${PN} += "libksieve"

inherit rpm
