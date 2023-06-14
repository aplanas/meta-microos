SUMMARY = "Translations for package gtkpod"
DESCRIPTION = "Provides translations for the 'gtkpod' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.5"

RPM_NAME = "gtkpod-lang-2.1.5-6.18.noarch.rpm"
RPM_HASH = "4f6b6d0b08542d5db85c2d22792cb48c1482396000bb4a23ca48ee16c11e1b756e09b8e3ea60ddba90ffa194ffc85171f9698c3ce8064f91f5c774aa830f5eb3"
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
