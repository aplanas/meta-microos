SUMMARY = "Translations for package grisbi"
DESCRIPTION = "Provides translations for the 'grisbi' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.5"

RPM_NAME = "grisbi-lang-2.0.5-1.9.noarch.rpm"
RPM_HASH = "ae3291e52802a464b436e50a12ffd44131352add45eb5419c48aa372e1357a11bf2afc1bc487d665b3502bfdceef83c9e046a9846a23d7a59bc338e4b9174666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grisbi-lang \
grisbi-lang-all \
locale-grisbi-cs \
locale-grisbi-da \
locale-grisbi-de \
locale-grisbi-el \
locale-grisbi-en-GB \
locale-grisbi-en-US \
locale-grisbi-eo \
locale-grisbi-es \
locale-grisbi-fa \
locale-grisbi-fr \
locale-grisbi-he \
locale-grisbi-it \
locale-grisbi-lv \
locale-grisbi-nl \
locale-grisbi-pl \
locale-grisbi-pt-BR \
locale-grisbi-ro \
locale-grisbi-ru \
locale-grisbi-sv \
locale-grisbi-zh-CN"

RDEPENDS:${PN} += "grisbi"

inherit rpm
