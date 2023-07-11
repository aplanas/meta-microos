SUMMARY = "Translations for package pcmanfm-qt"
DESCRIPTION = "Provides translations for the 'pcmanfm-qt' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "pcmanfm-qt-lang-1.3.0-1.2.noarch.rpm"
RPM_HASH = "f21aa52947c176c337b5e54e680cbc808c7656bf92823d5451cb5a14abea13769a79c3e92ba1c2eb8108b6cbb5045c0ab33acc20d562d6877746bb83cb881aa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcmanfm-qt-lang \
pcmanfm-qt-lang-all"

RDEPENDS:${PN} += "pcmanfm-qt"

inherit rpm
