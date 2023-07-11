SUMMARY = "Translations for package kamerka"
DESCRIPTION = "Provides translations for the 'kamerka' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.20"

RPM_NAME = "kamerka-lang-0.20-1.12.noarch.rpm"
RPM_HASH = "d753690f3cfd1c6fe8160863e23e812dfb86d386e2c995e25bb8e6fbffaf439144b5e4f276d9398de4ab518209b919c07dc478911b6debc0454700315672ef73"
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
