SUMMARY = "Translations for package mailcommon"
DESCRIPTION = "Provides translations for the 'mailcommon' package."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "mailcommon-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "2cb1b5cd42c21062d4cd86347bbd24f8e1c21560a78e9debc31dbfa76fb57ee9c43566b04f4768b4a6a2f296cbe68bb5da589ee4679dc77e99f5de46946c9ccb"
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
