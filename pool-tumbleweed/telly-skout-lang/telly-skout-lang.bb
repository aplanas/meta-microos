SUMMARY = "Translations for package telly-skout"
DESCRIPTION = "Provides translations for the 'telly-skout' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "telly-skout-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "04ad1c7f7ca33f98e461144a45ae103796a9b45d38b8dc4e661a9fd81ea85f3471174a1cc1f631c50ef23c312a02c59f8266c664c4abcaff4af68587c31d6d02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-telly-skout-ca \
locale-telly-skout-ca@valencia \
locale-telly-skout-cs \
locale-telly-skout-de \
locale-telly-skout-en-GB \
locale-telly-skout-es \
locale-telly-skout-fi \
locale-telly-skout-fr \
locale-telly-skout-gl \
locale-telly-skout-it \
locale-telly-skout-ja \
locale-telly-skout-ka \
locale-telly-skout-ko \
locale-telly-skout-lt \
locale-telly-skout-nl \
locale-telly-skout-pl \
locale-telly-skout-pt \
locale-telly-skout-ru \
locale-telly-skout-sk \
locale-telly-skout-sl \
locale-telly-skout-sv \
locale-telly-skout-tr \
locale-telly-skout-uk \
locale-telly-skout-zh-CN \
locale-telly-skout-zh-TW \
telly-skout-lang \
telly-skout-lang-all"

RDEPENDS:${PN} += "telly-skout"

inherit rpm
