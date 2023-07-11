SUMMARY = "Translations for package guvcview-qt5"
DESCRIPTION = "Provides translations for the 'guvcview-qt5' package."
LICENSE = "GPL-3.0-only"

PV = "2.0.8"

RPM_NAME = "guvcview-qt5-lang-2.0.8-1.5.noarch.rpm"
RPM_HASH = "5d015d103679e538ffb80a446e517ec747eb676f870a9147e0f781ca99f7fc23029012a4f25814c465abdb1097206cb0cd37d998b6461a9ffe8c88a9e91dab2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guvcview-qt5-lang \
guvcview-qt5-lang-all \
locale-guvcview-qt5-bg \
locale-guvcview-qt5-bs \
locale-guvcview-qt5-cs \
locale-guvcview-qt5-da \
locale-guvcview-qt5-de \
locale-guvcview-qt5-en-AU \
locale-guvcview-qt5-es \
locale-guvcview-qt5-eu \
locale-guvcview-qt5-fr \
locale-guvcview-qt5-gl \
locale-guvcview-qt5-he \
locale-guvcview-qt5-hr \
locale-guvcview-qt5-it \
locale-guvcview-qt5-ja \
locale-guvcview-qt5-lv \
locale-guvcview-qt5-nl \
locale-guvcview-qt5-pl \
locale-guvcview-qt5-pt \
locale-guvcview-qt5-pt-BR \
locale-guvcview-qt5-ru \
locale-guvcview-qt5-si \
locale-guvcview-qt5-sr \
locale-guvcview-qt5-tr \
locale-guvcview-qt5-uk \
locale-guvcview-qt5-zh-TW"

RDEPENDS:${PN} += "guvcview-qt5"

inherit rpm
