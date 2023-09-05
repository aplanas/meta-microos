SUMMARY = "Translations for package mailcommon"
DESCRIPTION = "Provides translations for the 'mailcommon' package."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "mailcommon-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "01c4f1edadf9b895171c5e786c786cfd88e1b5d2f727592c82588c1859f026cbc90ed7538b2092592da6305289ec827674a734b5c04234c12eff02d07aa492a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mailcommon-ar \
locale-mailcommon-bg \
locale-mailcommon-bs \
locale-mailcommon-ca \
locale-mailcommon-ca@valencia \
locale-mailcommon-cs \
locale-mailcommon-da \
locale-mailcommon-de \
locale-mailcommon-el \
locale-mailcommon-en-GB \
locale-mailcommon-es \
locale-mailcommon-et \
locale-mailcommon-eu \
locale-mailcommon-fi \
locale-mailcommon-fr \
locale-mailcommon-ga \
locale-mailcommon-gl \
locale-mailcommon-hr \
locale-mailcommon-hu \
locale-mailcommon-ia \
locale-mailcommon-it \
locale-mailcommon-ja \
locale-mailcommon-ka \
locale-mailcommon-kk \
locale-mailcommon-ko \
locale-mailcommon-lt \
locale-mailcommon-mr \
locale-mailcommon-nb \
locale-mailcommon-nds \
locale-mailcommon-nl \
locale-mailcommon-nn \
locale-mailcommon-pa \
locale-mailcommon-pl \
locale-mailcommon-pt \
locale-mailcommon-pt-BR \
locale-mailcommon-ro \
locale-mailcommon-ru \
locale-mailcommon-sk \
locale-mailcommon-sl \
locale-mailcommon-sr \
locale-mailcommon-sr@ijekavian \
locale-mailcommon-sr@ijekavianlatin \
locale-mailcommon-sr@latin \
locale-mailcommon-sv \
locale-mailcommon-tr \
locale-mailcommon-ug \
locale-mailcommon-uk \
locale-mailcommon-zh-CN \
locale-mailcommon-zh-TW \
mailcommon-lang \
mailcommon-lang-all"

RDEPENDS:${PN} += "mailcommon"

inherit rpm
