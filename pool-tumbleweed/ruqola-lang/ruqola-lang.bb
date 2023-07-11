SUMMARY = "Translations for package ruqola"
DESCRIPTION = "Provides translations for the 'ruqola' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.1"

RPM_NAME = "ruqola-lang-1.9.1-2.2.noarch.rpm"
RPM_HASH = "30a6c48ba0922fd7bb734eddb520e3f63d52c469d1a8a00d269fb6001ba7abe27c7eccfb799b5f9f1a1ca2d0aa7ece30bbb3e50aaf591d04c6fdf5caabbe1ed1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-ruqola-ca \
locale-ruqola-ca@valencia \
locale-ruqola-cs \
locale-ruqola-de \
locale-ruqola-en-GB \
locale-ruqola-es \
locale-ruqola-et \
locale-ruqola-eu \
locale-ruqola-fi \
locale-ruqola-fr \
locale-ruqola-ia \
locale-ruqola-it \
locale-ruqola-ka \
locale-ruqola-lt \
locale-ruqola-nl \
locale-ruqola-pl \
locale-ruqola-pt \
locale-ruqola-pt-BR \
locale-ruqola-ru \
locale-ruqola-sk \
locale-ruqola-sl \
locale-ruqola-sv \
locale-ruqola-tr \
locale-ruqola-uk \
locale-ruqola-zh-CN \
locale-ruqola-zh-TW \
ruqola-lang \
ruqola-lang-all"

RDEPENDS:${PN} += "ruqola"

inherit rpm
