SUMMARY = "Translations for package notejot"
DESCRIPTION = "Provides translations for the 'notejot' package."
LICENSE = "GPL-3.0-only"

PV = "3.4.9"

RPM_NAME = "notejot-lang-3.4.9-1.7.noarch.rpm"
RPM_HASH = "4f7d86e42dc3068a5f6941234307feab23f8b47c63cf4d5ff2a8d387f3e4bd0d0e83cf2e039fbd5ac2a7591c41778c6b4a6d25e798f87b73aacc71307a455e81"
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
