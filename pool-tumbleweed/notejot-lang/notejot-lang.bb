SUMMARY = "Translations for package notejot"
DESCRIPTION = "Provides translations for the 'notejot' package."
LICENSE = "GPL-3.0-only"

PV = "3.4.9"

RPM_NAME = "notejot-lang-3.4.9-1.8.noarch.rpm"
RPM_HASH = "4c86af2964cc1c33bc026a43b0c116c300dfd043066d2e538089e8faa201a1db4d9ba15c9800be18138fe56bab21acfdeaf9d349c4f8134aeb8bdcab8bb1eb03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-notejot-ca \
locale-notejot-cs \
locale-notejot-da \
locale-notejot-de \
locale-notejot-es \
locale-notejot-fr \
locale-notejot-gl \
locale-notejot-it \
locale-notejot-ja \
locale-notejot-lt \
locale-notejot-nl \
locale-notejot-pl \
locale-notejot-pt \
locale-notejot-pt-BR \
locale-notejot-ru \
locale-notejot-sv \
locale-notejot-tr-TR \
notejot-lang \
notejot-lang-all"

RDEPENDS:${PN} += "notejot"

inherit rpm
