SUMMARY = "Translations for package info"
DESCRIPTION = "Provides translations for the 'info' package."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "info-lang-7.0.3-1.4.noarch.rpm"
RPM_HASH = "5dd21913795e7d72bc96b3680024ae3863fce9ba2def5495a5e6a9010789477003356187b1db03f13e202e3262b43802b7d5a2f67cbc0db57a3791103f3340f0"
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
