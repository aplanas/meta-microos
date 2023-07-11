SUMMARY = "Translations for package geeqie"
DESCRIPTION = "Provides translations for the 'geeqie' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.1"

RPM_NAME = "geeqie-lang-2.1-2.1.noarch.rpm"
RPM_HASH = "17c83e9af851920f4611633dc9ae3c885679a7eea7f5cb7002cd5bb48d0174628e9bf5d545392196d1457df390680814277a643460937223e7dd08326b990718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geeqie-lang \
geeqie-lang-all \
locale-geeqie-ar \
locale-geeqie-be \
locale-geeqie-bg \
locale-geeqie-ca \
locale-geeqie-cs \
locale-geeqie-da \
locale-geeqie-de \
locale-geeqie-el \
locale-geeqie-en-GB \
locale-geeqie-eo \
locale-geeqie-es \
locale-geeqie-et \
locale-geeqie-eu \
locale-geeqie-fi \
locale-geeqie-fr \
locale-geeqie-hu \
locale-geeqie-id \
locale-geeqie-it \
locale-geeqie-ja \
locale-geeqie-ko \
locale-geeqie-nb \
locale-geeqie-nl \
locale-geeqie-pl \
locale-geeqie-pt-BR \
locale-geeqie-ro \
locale-geeqie-ru \
locale-geeqie-sk \
locale-geeqie-sl \
locale-geeqie-sr \
locale-geeqie-sr@latin \
locale-geeqie-sv \
locale-geeqie-th \
locale-geeqie-tr \
locale-geeqie-uk \
locale-geeqie-vi \
locale-geeqie-zh-CN \
locale-geeqie-zh-TW"

RDEPENDS:${PN} += "geeqie"

inherit rpm
