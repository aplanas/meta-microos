SUMMARY = "Translations for package info"
DESCRIPTION = "Provides translations for the 'info' package."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "info-lang-7.0.3-1.3.noarch.rpm"
RPM_HASH = "7d83220ef89eae1a486505afe2bab1c454b12ca58a5867d3ffe441ab6a5de5f28ea8369b7a3b8836dc87d38638bb94aeed047683e934080ce93769c6d251f438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "info-lang \
info-lang-all \
locale-info-ca \
locale-info-cs \
locale-info-da \
locale-info-de \
locale-info-el \
locale-info-eo \
locale-info-es \
locale-info-fi \
locale-info-fr \
locale-info-he \
locale-info-hr \
locale-info-hu \
locale-info-id \
locale-info-it \
locale-info-ja \
locale-info-nb \
locale-info-nl \
locale-info-pl \
locale-info-pt \
locale-info-pt-BR \
locale-info-ro \
locale-info-ru \
locale-info-sk \
locale-info-sl \
locale-info-sr \
locale-info-sv \
locale-info-tr \
locale-info-uk \
locale-info-vi \
locale-info-zh-CN \
locale-info-zh-TW"

RDEPENDS:${PN} += "info"

inherit rpm
