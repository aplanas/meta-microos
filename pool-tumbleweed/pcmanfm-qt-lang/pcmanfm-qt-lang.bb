SUMMARY = "Translations for package pcmanfm-qt"
DESCRIPTION = "Provides translations for the 'pcmanfm-qt' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "pcmanfm-qt-lang-1.3.0-1.1.noarch.rpm"
RPM_HASH = "3804d69e4a87c36d534dd163dfd7c2dc70324d946601a8903e1291853ec871772c1a0b5cef10404a2784c02e9b0f12cca020e236a65a8eca05a7a2f41cb82ab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcmanfm-qt-lang \
pcmanfm-qt-lang-all"

RDEPENDS:${PN} += "pcmanfm-qt"

inherit rpm
