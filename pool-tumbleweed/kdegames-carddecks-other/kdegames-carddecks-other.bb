SUMMARY = "Further Card Decks for KDE Games"
DESCRIPTION = "This package contains several further card deck set for KDE games."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kdegames-carddecks-other-23.08.0-1.1.noarch.rpm"
RPM_HASH = "e1489a30562c4f22ab293550167216d15454ad3111aa0d7756a6c0f1237706089dd18b90bf5d00cbcaa1a8d99cd4c654ba9611dfe2599668ba2b68722774eb1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdegames-carddecks-other"

RDEPENDS:${PN} += "kdegames-carddecks-default"

inherit rpm
