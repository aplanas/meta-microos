SUMMARY = "Translations for package tomoe-gtk"
DESCRIPTION = "Provides translations for the 'tomoe-gtk' package."
LICENSE = "LGPL-2.1+"

PV = "0.6.0"

RPM_NAME = "tomoe-gtk-lang-0.6.0-44.24.noarch.rpm"
RPM_HASH = "fdfc716e4fe4c7a170e67d078aaf398005f11433031e1b8e302d8ed3963f8c0687887629d4fba8203ab7de1c60e50a4b725cc9cd368c66a11634574ec31eea6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tomoe-gtk-ja \
tomoe-gtk-lang \
tomoe-gtk-lang-all"

RDEPENDS:${PN} += "tomoe-gtk"

inherit rpm
