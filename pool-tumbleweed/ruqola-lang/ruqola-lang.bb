SUMMARY = "Translations for package ruqola"
DESCRIPTION = "Provides translations for the 'ruqola' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.1"

RPM_NAME = "ruqola-lang-1.9.1-2.1.noarch.rpm"
RPM_HASH = "d453d971975c044644bf98a67d966e4c59c71ad1d60ee34cf2347b51a819bfa58fb92725d2e9ada9b739be21a0473efe7e619fe0a757679e24b0bc94236879e7"
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
