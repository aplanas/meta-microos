SUMMARY = "Translations for package deepin-draw"
DESCRIPTION = "Provides translations for the 'deepin-draw' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.11.4"

RPM_NAME = "deepin-draw-lang-5.11.4-1.3.noarch.rpm"
RPM_HASH = "9b8cde9469272021f0ab7c67de29d77c7e745914573725523a899bdb90a49b4c282a1379c2d4e438d9df7ee1359e3198752c8a633ce7682b1f11a8d6ef2f017a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-draw-lang \
deepin-draw-lang-all"
RDEPENDS:${PN} += "deepin-draw"

inherit rpm
