SUMMARY = "Translations for package gcal"
DESCRIPTION = "Provides translations for the 'gcal' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.1"

RPM_NAME = "gcal-lang-4.1-3.5.noarch.rpm"
RPM_HASH = "de15bf3520c09e0cc7f26864cb93f303beb60d90b8766a7d8c0a6bf7c295f0e6c33ea984dde1ee786083db78ac834a64e131d68d639e4b280d6c48ec7ddcde45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcal-lang \
gcal-lang-all \
locale-gcal-ca \
locale-gcal-da \
locale-gcal-de \
locale-gcal-es \
locale-gcal-fr \
locale-gcal-it \
locale-gcal-lt \
locale-gcal-nl \
locale-gcal-pl \
locale-gcal-ru \
locale-gcal-sv \
locale-gcal-tr \
locale-gcal-zh-CN"

RDEPENDS:${PN} += "gcal"

inherit rpm
