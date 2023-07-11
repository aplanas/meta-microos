SUMMARY = "Translations for package akonadi-search"
DESCRIPTION = "Provides translations for the 'akonadi-search' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "23.04.3"

RPM_NAME = "akonadi-search-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "6df4ba6b2aa81a57408a8d7b3216d6d0d943bf6e56133b50e84cf155bc983290469130fc7ffdc6fc78a36dad0cc19d8ae64ca02e111fa065b4177cd04199eab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "akonadi-search-lang \
akonadi-search-lang-all \
locale-akonadi-search-ar \
locale-akonadi-search-az \
locale-akonadi-search-bg \
locale-akonadi-search-ca \
locale-akonadi-search-ca@valencia \
locale-akonadi-search-cs \
locale-akonadi-search-da \
locale-akonadi-search-de \
locale-akonadi-search-el \
locale-akonadi-search-en-GB \
locale-akonadi-search-es \
locale-akonadi-search-et \
locale-akonadi-search-eu \
locale-akonadi-search-fi \
locale-akonadi-search-fr \
locale-akonadi-search-gl \
locale-akonadi-search-hi \
locale-akonadi-search-hu \
locale-akonadi-search-ia \
locale-akonadi-search-id \
locale-akonadi-search-it \
locale-akonadi-search-ja \
locale-akonadi-search-ka \
locale-akonadi-search-ko \
locale-akonadi-search-lt \
locale-akonadi-search-nb \
locale-akonadi-search-nl \
locale-akonadi-search-nn \
locale-akonadi-search-pl \
locale-akonadi-search-pt \
locale-akonadi-search-pt-BR \
locale-akonadi-search-ro \
locale-akonadi-search-ru \
locale-akonadi-search-sk \
locale-akonadi-search-sl \
locale-akonadi-search-sr \
locale-akonadi-search-sr@ijekavian \
locale-akonadi-search-sr@ijekavianlatin \
locale-akonadi-search-sr@latin \
locale-akonadi-search-sv \
locale-akonadi-search-tr \
locale-akonadi-search-uk \
locale-akonadi-search-zh-CN \
locale-akonadi-search-zh-TW"

RDEPENDS:${PN} += "akonadi-search"

inherit rpm
