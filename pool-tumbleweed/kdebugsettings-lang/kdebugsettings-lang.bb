SUMMARY = "Translations for package kdebugsettings"
DESCRIPTION = "Provides translations for the 'kdebugsettings' package."
LICENSE = "LGPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kdebugsettings-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "a7b9b76264116733b8678576580e1aa01a768e2fa2fd494a43268ef9ab84ab7f5fe3f331214f0dcf933becf4b2f01ed16b2df89e482f49c1712048287612f699"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdebugsettings-lang \
kdebugsettings-lang-all \
locale-kdebugsettings-ar \
locale-kdebugsettings-az \
locale-kdebugsettings-ca \
locale-kdebugsettings-ca@valencia \
locale-kdebugsettings-cs \
locale-kdebugsettings-da \
locale-kdebugsettings-de \
locale-kdebugsettings-el \
locale-kdebugsettings-en-GB \
locale-kdebugsettings-es \
locale-kdebugsettings-et \
locale-kdebugsettings-eu \
locale-kdebugsettings-fi \
locale-kdebugsettings-fr \
locale-kdebugsettings-gl \
locale-kdebugsettings-hu \
locale-kdebugsettings-ia \
locale-kdebugsettings-it \
locale-kdebugsettings-ja \
locale-kdebugsettings-ka \
locale-kdebugsettings-ko \
locale-kdebugsettings-lt \
locale-kdebugsettings-nl \
locale-kdebugsettings-nn \
locale-kdebugsettings-pl \
locale-kdebugsettings-pt \
locale-kdebugsettings-pt-BR \
locale-kdebugsettings-ro \
locale-kdebugsettings-ru \
locale-kdebugsettings-sk \
locale-kdebugsettings-sl \
locale-kdebugsettings-sr \
locale-kdebugsettings-sr@ijekavian \
locale-kdebugsettings-sr@ijekavianlatin \
locale-kdebugsettings-sr@latin \
locale-kdebugsettings-sv \
locale-kdebugsettings-tr \
locale-kdebugsettings-uk \
locale-kdebugsettings-zh-CN \
locale-kdebugsettings-zh-TW"

RDEPENDS:${PN} += "kdebugsettings"

inherit rpm
