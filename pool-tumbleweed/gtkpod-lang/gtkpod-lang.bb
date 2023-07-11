SUMMARY = "Translations for package gtkpod"
DESCRIPTION = "Provides translations for the 'gtkpod' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.5"

RPM_NAME = "gtkpod-lang-2.1.5-6.19.noarch.rpm"
RPM_HASH = "3556cf63d3768f0f3760f789644a63a61c5e7d771621dc39aaaaf044027caaf0c53d508bbcaa5aae8b19f2ada2fe37eb849e2f0e2c1432475204f05afeb9c520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkpod-lang \
gtkpod-lang-all \
locale-gtkpod-ca \
locale-gtkpod-cs-CZ \
locale-gtkpod-de \
locale-gtkpod-es \
locale-gtkpod-fr \
locale-gtkpod-he \
locale-gtkpod-it \
locale-gtkpod-ja \
locale-gtkpod-nl \
locale-gtkpod-pt-BR \
locale-gtkpod-ro \
locale-gtkpod-ru \
locale-gtkpod-sv \
locale-gtkpod-zh-CN \
locale-gtkpod-zh-TW"

RDEPENDS:${PN} += "gtkpod"

inherit rpm
