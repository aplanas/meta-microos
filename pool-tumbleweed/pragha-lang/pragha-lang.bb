SUMMARY = "Translations for package pragha"
DESCRIPTION = "Provides translations for the 'pragha' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.99.1"

RPM_NAME = "pragha-lang-1.3.99.1-3.4.noarch.rpm"
RPM_HASH = "6d79e256793c9136d607a7fecd6c411c4b76ea86684ae023a14f435fd7513ab2f51e0aa6c0c631450cd6c64f94a8bd04c803fded458d05c751ae35362d9e6fca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pragha-ar \
locale-pragha-bg \
locale-pragha-ca \
locale-pragha-cs \
locale-pragha-da \
locale-pragha-de \
locale-pragha-el \
locale-pragha-es \
locale-pragha-fr \
locale-pragha-hu \
locale-pragha-id \
locale-pragha-it \
locale-pragha-ja \
locale-pragha-ko \
locale-pragha-lt \
locale-pragha-nb \
locale-pragha-nl \
locale-pragha-pl \
locale-pragha-pt \
locale-pragha-pt-BR \
locale-pragha-ru \
locale-pragha-sk \
locale-pragha-sv \
locale-pragha-tr \
locale-pragha-uk \
locale-pragha-vi \
locale-pragha-zh-CN \
pragha-lang \
pragha-lang-all"

RDEPENDS:${PN} += "pragha"

inherit rpm
