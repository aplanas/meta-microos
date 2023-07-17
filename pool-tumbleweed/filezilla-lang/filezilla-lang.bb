SUMMARY = "Translations for package filezilla"
DESCRIPTION = "Provides translations for the 'filezilla' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.65.0"

RPM_NAME = "filezilla-lang-3.65.0-1.1.noarch.rpm"
RPM_HASH = "112e0b7f2095d4091ed9d4acd29ee31bc4de197f5541fab40dbaaf07b070fd158e5683937ec56e4c6a65ac7cc26c33978b0cf637a18098e8e55888cd86368c60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "filezilla-lang \
filezilla-lang-all \
locale-filezilla-ar \
locale-filezilla-az \
locale-filezilla-ca \
locale-filezilla-cs-CZ \
locale-filezilla-cy \
locale-filezilla-da \
locale-filezilla-de \
locale-filezilla-el \
locale-filezilla-es \
locale-filezilla-et \
locale-filezilla-eu \
locale-filezilla-fi-FI \
locale-filezilla-fr \
locale-filezilla-hr \
locale-filezilla-is \
locale-filezilla-it \
locale-filezilla-ka \
locale-filezilla-nb-NO \
locale-filezilla-ne \
locale-filezilla-nl \
locale-filezilla-nn-NO \
locale-filezilla-oc \
locale-filezilla-pl-PL \
locale-filezilla-pt-BR \
locale-filezilla-pt-PT \
locale-filezilla-ru \
locale-filezilla-sl-SI \
locale-filezilla-sr \
locale-filezilla-sv \
locale-filezilla-ta \
locale-filezilla-tr \
locale-filezilla-uk-UA \
locale-filezilla-zh-CN \
locale-filezilla-zh-TW"

RDEPENDS:${PN} += "filezilla"

inherit rpm
