SUMMARY = "Translations for package agenda"
DESCRIPTION = "Provides translations for the 'agenda' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "agenda-lang-1.1.2-1.10.noarch.rpm"
RPM_HASH = "2ea652b363378ee9f3bd4df38a8c4dd80c66ebd26c3aa8f06695252aced5ef6c36c02926d2167f1793a66dde5ad775deae653639d53186571b90fefb2f1fedbb"
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
