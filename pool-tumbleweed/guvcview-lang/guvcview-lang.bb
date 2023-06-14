SUMMARY = "Translations for package guvcview"
DESCRIPTION = "Provides translations for the 'guvcview' package."
LICENSE = "GPL-3.0-only"

PV = "2.0.8"

RPM_NAME = "guvcview-lang-2.0.8-1.7.noarch.rpm"
RPM_HASH = "bf53db1d649cc184d9b87faa11ffb8d67f889e73280c67b2a1813c37572c985055578f059970a31195741848ddc6e3c0c786202f0a977385b4660715896a1e9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guvcview-lang \
guvcview-lang-all \
locale-guvcview-bg \
locale-guvcview-bs \
locale-guvcview-cs \
locale-guvcview-da \
locale-guvcview-de \
locale-guvcview-en-AU \
locale-guvcview-es \
locale-guvcview-eu \
locale-guvcview-fr \
locale-guvcview-gl \
locale-guvcview-he \
locale-guvcview-hr \
locale-guvcview-it \
locale-guvcview-ja \
locale-guvcview-lv \
locale-guvcview-nl \
locale-guvcview-pl \
locale-guvcview-pt \
locale-guvcview-pt-BR \
locale-guvcview-ru \
locale-guvcview-si \
locale-guvcview-sr \
locale-guvcview-tr \
locale-guvcview-uk \
locale-guvcview-zh-TW"

RDEPENDS:${PN} += "guvcview"

inherit rpm
