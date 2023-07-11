SUMMARY = "Translations for package newsboat"
DESCRIPTION = "Provides translations for the 'newsboat' package."
LICENSE = "MIT"

PV = "2.32"

RPM_NAME = "newsboat-lang-2.32-1.1.noarch.rpm"
RPM_HASH = "c3d889d53814df7d71aee8bca5a52593ffca6e1a663c92a0c94b1bf8e32b75d40460ae7464d7ab5e67d0ea6faecaa42c7aa5c5e0b1d8bf7d49de168dd52616d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-newsboat-ca \
locale-newsboat-de \
locale-newsboat-es \
locale-newsboat-fr \
locale-newsboat-hu \
locale-newsboat-it \
locale-newsboat-ja \
locale-newsboat-nb \
locale-newsboat-nl \
locale-newsboat-pl \
locale-newsboat-pt-BR \
locale-newsboat-ru \
locale-newsboat-sk \
locale-newsboat-sv \
locale-newsboat-tr \
locale-newsboat-uk \
locale-newsboat-zh-TW \
newsboat-lang \
newsboat-lang-all"

RDEPENDS:${PN} += "newsboat"

inherit rpm
