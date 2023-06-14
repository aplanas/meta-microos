SUMMARY = "Translations for package pragha"
DESCRIPTION = "Provides translations for the 'pragha' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.99.1"

RPM_NAME = "pragha-lang-1.3.99.1-3.3.noarch.rpm"
RPM_HASH = "0143c8a52f6d6f7c134fa7ede1dabe5cc0cd57fbf16349ddeeda63a280c101797af1516f5bb85838fc2710fb2a6afabb26b63abb8d17754a8c2f39925b31b26b"
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
