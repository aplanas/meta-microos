SUMMARY = "Translations for package kamerka"
DESCRIPTION = "Provides translations for the 'kamerka' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.20"

RPM_NAME = "kamerka-lang-0.20-1.11.noarch.rpm"
RPM_HASH = "e4eb29af387d4d95ea69b5ac09965f50a8f3ee8ca18c53f2e94eb66a93e126c80835e8b06a311c6a552d1f7219d8dd247cb2441cde8be19c32c3d19da1029da0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kamerka-lang \
kamerka-lang-all \
locale-kamerka-cs \
locale-kamerka-de \
locale-kamerka-es \
locale-kamerka-nl \
locale-kamerka-pl \
locale-kamerka-pt \
locale-kamerka-ru \
locale-kamerka-sr \
locale-kamerka-sr@ijekavian \
locale-kamerka-sr@ijekavianlatin \
locale-kamerka-sr@latin \
locale-kamerka-uk \
locale-kamerka-zh-CN \
locale-kamerka-zh-TW"

RDEPENDS:${PN} += "kamerka"

inherit rpm
