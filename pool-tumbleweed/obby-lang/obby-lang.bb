SUMMARY = "Translations for package obby"
DESCRIPTION = "Provides translations for the 'obby' package."
LICENSE = "GPL-2.0+"

PV = "0.4.8"

RPM_NAME = "obby-lang-0.4.8-11.30.noarch.rpm"
RPM_HASH = "24714dbe9f0f667651ba2a9e1e35f59fc099b2de65fc02f88743dfc31ef3b544412c7845f52bddfecdb07830901ef56372d32b8bdd8afcb71d3cac4aae03909a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-obby-ast \
locale-obby-ca \
locale-obby-da \
locale-obby-de \
locale-obby-en-GB \
locale-obby-es \
locale-obby-fr \
locale-obby-it \
locale-obby-nl \
locale-obby-oc \
locale-obby-pt-BR \
locale-obby-sv \
locale-obby-uk \
obby-lang \
obby-lang-all"

RDEPENDS:${PN} += "obby"

inherit rpm
