SUMMARY = "Default Card Decks for KDE Games"
DESCRIPTION = "This package contains the default card deck set for KDE games."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kdegames-carddecks-default-23.04.3-1.1.noarch.rpm"
RPM_HASH = "64c3a7898672eaf9d4e101a33993192ec3cda38e3086af15ec89ebf8a6e48f0484b41c36bd751dd47951fb8c95665d09d72cb16037984a8b14090bb06d28b8a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdegames-carddecks-default"

RDEPENDS:${PN} += ""

inherit rpm
