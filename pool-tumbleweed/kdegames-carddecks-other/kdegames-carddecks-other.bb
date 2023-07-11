SUMMARY = "Further Card Decks for KDE Games"
DESCRIPTION = "This package contains several further card deck set for KDE games."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kdegames-carddecks-other-23.04.3-1.1.noarch.rpm"
RPM_HASH = "421b179040be503e2eb06d0d4821d29d009310c23bdec7d4ff2f2b6961dd3ebf0fedc852ffa42d6b99c497cae78e2003686f42b2a1cfbfde1329edf3fdc4dda7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdegames-carddecks-other"

RDEPENDS:${PN} += "kdegames-carddecks-default"

inherit rpm
