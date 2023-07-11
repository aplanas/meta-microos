SUMMARY = "Translations for package subtitlecomposer"
DESCRIPTION = "Provides translations for the 'subtitlecomposer' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "subtitlecomposer-lang-0.7.1-6.3.noarch.rpm"
RPM_HASH = "e1469669463a2f82230dd73d134785f05cf45044e1eabd6a1bf19068ef189f69d68034f3b909f5287d145dc56d405947c8934b4bda939edb0d1df0a36b40c1bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-subtitlecomposer-bg \
locale-subtitlecomposer-ca \
locale-subtitlecomposer-ca@valencia \
locale-subtitlecomposer-cs \
locale-subtitlecomposer-de \
locale-subtitlecomposer-el \
locale-subtitlecomposer-en-GB \
locale-subtitlecomposer-es \
locale-subtitlecomposer-et \
locale-subtitlecomposer-fi \
locale-subtitlecomposer-fr \
locale-subtitlecomposer-hr \
locale-subtitlecomposer-hu \
locale-subtitlecomposer-it \
locale-subtitlecomposer-nl \
locale-subtitlecomposer-pl \
locale-subtitlecomposer-pt \
locale-subtitlecomposer-pt-BR \
locale-subtitlecomposer-ru \
locale-subtitlecomposer-sk \
locale-subtitlecomposer-sl \
locale-subtitlecomposer-sr \
locale-subtitlecomposer-sr@latin \
locale-subtitlecomposer-sv \
locale-subtitlecomposer-uk \
locale-subtitlecomposer-zh-TW \
subtitlecomposer-lang \
subtitlecomposer-lang-all"

RDEPENDS:${PN} += "subtitlecomposer"

inherit rpm
