SUMMARY = "Translations for package xapp-common"
DESCRIPTION = "Provides translations for the 'xapp-common' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.6.1"

RPM_NAME = "xapp-common-lang-2.6.1-1.1.noarch.rpm"
RPM_HASH = "f132c4a3af9e03f35d81d25c561f8df073494a07955999112787aed53fd100b4e4e49a6d4cbe7f053698ed650bf62fa2c58d6c5a17ab8aa296285e0f307e8412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xapp-common-af \
locale-xapp-common-ar \
locale-xapp-common-az \
locale-xapp-common-be \
locale-xapp-common-bg \
locale-xapp-common-bn \
locale-xapp-common-ca \
locale-xapp-common-ca@valencia \
locale-xapp-common-cs \
locale-xapp-common-cy \
locale-xapp-common-da \
locale-xapp-common-de \
locale-xapp-common-el \
locale-xapp-common-en-GB \
locale-xapp-common-eo \
locale-xapp-common-es \
locale-xapp-common-et \
locale-xapp-common-eu \
locale-xapp-common-fi \
locale-xapp-common-fr \
locale-xapp-common-fr-CA \
locale-xapp-common-he \
locale-xapp-common-hi \
locale-xapp-common-hr \
locale-xapp-common-hu \
locale-xapp-common-ia \
locale-xapp-common-id \
locale-xapp-common-is \
locale-xapp-common-it \
locale-xapp-common-ja \
locale-xapp-common-ka \
locale-xapp-common-kk \
locale-xapp-common-ko \
locale-xapp-common-lt \
locale-xapp-common-mai \
locale-xapp-common-ms \
locale-xapp-common-nl \
locale-xapp-common-oc \
locale-xapp-common-pl \
locale-xapp-common-pt \
locale-xapp-common-pt-BR \
locale-xapp-common-ro \
locale-xapp-common-ru \
locale-xapp-common-sk \
locale-xapp-common-sl \
locale-xapp-common-sr \
locale-xapp-common-sr@latin \
locale-xapp-common-sv \
locale-xapp-common-tr \
locale-xapp-common-uk \
locale-xapp-common-zh-CN \
locale-xapp-common-zh-HK \
locale-xapp-common-zh-TW \
xapp-common-lang \
xapp-common-lang-all"

RDEPENDS:${PN} += "xapp-common"

inherit rpm
