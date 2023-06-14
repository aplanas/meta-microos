SUMMARY = "Translations for package gtkhtml-4_0"
DESCRIPTION = "Provides translations for the 'gtkhtml-4_0' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.10.0"

RPM_NAME = "gtkhtml-4_0-lang-4.10.0-7.3.noarch.rpm"
RPM_HASH = "9acf74e03698192f72ce2b185cb4639947f4eaae0136e23062e1fa2b017ce17b1446542580d3765d3e1311ef0c201222c1cf053e4bbf3f786a8ee4edc66f3125"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkhtml-4-0-lang \
gtkhtml-4-0-lang-all \
locale-gtkhtml-4-0-af \
locale-gtkhtml-4-0-ar \
locale-gtkhtml-4-0-as \
locale-gtkhtml-4-0-ast \
locale-gtkhtml-4-0-az \
locale-gtkhtml-4-0-be \
locale-gtkhtml-4-0-bg \
locale-gtkhtml-4-0-bn \
locale-gtkhtml-4-0-bn-IN \
locale-gtkhtml-4-0-bs \
locale-gtkhtml-4-0-ca \
locale-gtkhtml-4-0-ca@valencia \
locale-gtkhtml-4-0-cs \
locale-gtkhtml-4-0-cy \
locale-gtkhtml-4-0-da \
locale-gtkhtml-4-0-de \
locale-gtkhtml-4-0-dz \
locale-gtkhtml-4-0-el \
locale-gtkhtml-4-0-en-CA \
locale-gtkhtml-4-0-en-GB \
locale-gtkhtml-4-0-en@shaw \
locale-gtkhtml-4-0-eo \
locale-gtkhtml-4-0-es \
locale-gtkhtml-4-0-et \
locale-gtkhtml-4-0-eu \
locale-gtkhtml-4-0-fa \
locale-gtkhtml-4-0-fi \
locale-gtkhtml-4-0-fr \
locale-gtkhtml-4-0-ga \
locale-gtkhtml-4-0-gl \
locale-gtkhtml-4-0-gu \
locale-gtkhtml-4-0-he \
locale-gtkhtml-4-0-hi \
locale-gtkhtml-4-0-hr \
locale-gtkhtml-4-0-hu \
locale-gtkhtml-4-0-id \
locale-gtkhtml-4-0-it \
locale-gtkhtml-4-0-ja \
locale-gtkhtml-4-0-ka \
locale-gtkhtml-4-0-kn \
locale-gtkhtml-4-0-ko \
locale-gtkhtml-4-0-lt \
locale-gtkhtml-4-0-lv \
locale-gtkhtml-4-0-mai \
locale-gtkhtml-4-0-mk \
locale-gtkhtml-4-0-ml \
locale-gtkhtml-4-0-mr \
locale-gtkhtml-4-0-ms \
locale-gtkhtml-4-0-nb \
locale-gtkhtml-4-0-ne \
locale-gtkhtml-4-0-nl \
locale-gtkhtml-4-0-nn \
locale-gtkhtml-4-0-oc \
locale-gtkhtml-4-0-or \
locale-gtkhtml-4-0-pa \
locale-gtkhtml-4-0-pl \
locale-gtkhtml-4-0-pt \
locale-gtkhtml-4-0-pt-BR \
locale-gtkhtml-4-0-ro \
locale-gtkhtml-4-0-ru \
locale-gtkhtml-4-0-si \
locale-gtkhtml-4-0-sk \
locale-gtkhtml-4-0-sl \
locale-gtkhtml-4-0-sq \
locale-gtkhtml-4-0-sr \
locale-gtkhtml-4-0-sr@latin \
locale-gtkhtml-4-0-sv \
locale-gtkhtml-4-0-ta \
locale-gtkhtml-4-0-te \
locale-gtkhtml-4-0-th \
locale-gtkhtml-4-0-tr \
locale-gtkhtml-4-0-ug \
locale-gtkhtml-4-0-uk \
locale-gtkhtml-4-0-vi \
locale-gtkhtml-4-0-zh-CN \
locale-gtkhtml-4-0-zh-HK \
locale-gtkhtml-4-0-zh-TW"

RDEPENDS:${PN} += "gtkhtml-4-0"

inherit rpm
