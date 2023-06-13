SUMMARY = "Further Card Decks for KDE Games"
DESCRIPTION = "This package contains several further card deck set for KDE games."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kdegames-carddecks-other-23.04.1-1.1.noarch.rpm"
RPM_HASH = "1348ac0cba451331059e58f2161a9292621a1e4336e4d69f0c617c79f355068d10fb5045434deb7e7b7d56360488860cc20db4dcbb2b0958cdbcd40d71954f3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdegames-carddecks-other"

RDEPENDS:${PN} += "kdegames-carddecks-default"

inherit rpm
