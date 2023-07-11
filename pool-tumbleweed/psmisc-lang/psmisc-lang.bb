SUMMARY = "Translations for package psmisc"
DESCRIPTION = "Provides translations for the 'psmisc' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.6"

RPM_NAME = "psmisc-lang-23.6-3.4.noarch.rpm"
RPM_HASH = "14ed57ab1ee666cd2eb258dc68318f56ed6dd5f5e34238b37aa2aff52f8a2a117b4b6300bc4768b288a986c7c7e9e97ce89cd928bd21ef2b90d094690b0ccfba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-psmisc-bg \
locale-psmisc-ca \
locale-psmisc-cs \
locale-psmisc-da \
locale-psmisc-de \
locale-psmisc-el \
locale-psmisc-eo \
locale-psmisc-es \
locale-psmisc-eu \
locale-psmisc-fi \
locale-psmisc-fr \
locale-psmisc-hr \
locale-psmisc-hu \
locale-psmisc-id \
locale-psmisc-it \
locale-psmisc-ja \
locale-psmisc-nb \
locale-psmisc-nl \
locale-psmisc-pl \
locale-psmisc-pt \
locale-psmisc-pt-BR \
locale-psmisc-ro \
locale-psmisc-ru \
locale-psmisc-sr \
locale-psmisc-sv \
locale-psmisc-uk \
locale-psmisc-vi \
locale-psmisc-zh-CN \
locale-psmisc-zh-TW \
psmisc-lang \
psmisc-lang-all"

RDEPENDS:${PN} += "psmisc"

inherit rpm
