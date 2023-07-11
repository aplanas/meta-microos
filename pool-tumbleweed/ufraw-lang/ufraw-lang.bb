SUMMARY = "Translations for package ufraw"
DESCRIPTION = "Provides translations for the 'ufraw' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.22"

RPM_NAME = "ufraw-lang-0.22-11.9.noarch.rpm"
RPM_HASH = "261577f52b5815efa413e7e91c0890f757e3fbaeb942a92eb27f639e3154b0a913024b965d7548e735ab77f790b6c3f65b070f9e628c2c795ecf1c241769408f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-ufraw-ca \
locale-ufraw-cs \
locale-ufraw-da \
locale-ufraw-de \
locale-ufraw-es \
locale-ufraw-fr \
locale-ufraw-it \
locale-ufraw-ja \
locale-ufraw-ko \
locale-ufraw-nb \
locale-ufraw-nl \
locale-ufraw-pl \
locale-ufraw-pt \
locale-ufraw-ru \
locale-ufraw-sr \
locale-ufraw-sr@latin \
locale-ufraw-sv \
locale-ufraw-zh-CN \
locale-ufraw-zh-TW \
ufraw-lang \
ufraw-lang-all"

RDEPENDS:${PN} += "ufraw"

inherit rpm
