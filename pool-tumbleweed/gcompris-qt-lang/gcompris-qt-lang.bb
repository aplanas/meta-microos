SUMMARY = "Translations for package gcompris-qt"
DESCRIPTION = "Provides translations for the 'gcompris-qt' package."
LICENSE = "AGPL-3.0-or-later"

PV = "3.3"

RPM_NAME = "gcompris-qt-lang-3.3-1.1.noarch.rpm"
RPM_HASH = "c56a2832faf6c976fb9f7f5726c7b888c2d511aea96269235279ca27992d398255118a31c46ddd11f8fb8d6d690cb37aea1ccebbe657b4224406f53b2d4ba3fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcompris-qt-lang \
gcompris-qt-lang-all"

RDEPENDS:${PN} += "gcompris-qt"

inherit rpm
