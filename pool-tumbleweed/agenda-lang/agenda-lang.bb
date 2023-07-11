SUMMARY = "Translations for package agenda"
DESCRIPTION = "Provides translations for the 'agenda' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "agenda-lang-1.1.2-1.11.noarch.rpm"
RPM_HASH = "e56bdb58d49d627a1903400dfe23fd18c66b44e5495a528e00ef429a22ff7ca6ee3b9a4619861d83c1f9ac83aa1df66d4d54140c77531f3c997ca8c643b77303"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "agenda-lang \
agenda-lang-all \
locale-agenda-af \
locale-agenda-ca \
locale-agenda-da \
locale-agenda-de \
locale-agenda-el \
locale-agenda-en-GB \
locale-agenda-eo \
locale-agenda-es \
locale-agenda-et \
locale-agenda-fi \
locale-agenda-fr \
locale-agenda-fr-CA \
locale-agenda-gl \
locale-agenda-he \
locale-agenda-id \
locale-agenda-it \
locale-agenda-ja \
locale-agenda-ka \
locale-agenda-km \
locale-agenda-ko \
locale-agenda-lt \
locale-agenda-ms \
locale-agenda-nb \
locale-agenda-nl \
locale-agenda-nn \
locale-agenda-pl \
locale-agenda-pt \
locale-agenda-pt-BR \
locale-agenda-ru \
locale-agenda-sr \
locale-agenda-sr@latin \
locale-agenda-sv \
locale-agenda-tr \
locale-agenda-ug \
locale-agenda-zh-CN"

RDEPENDS:${PN} += "agenda"

inherit rpm
