SUMMARY = "Documentation for the 'Five or More' GNOME game"
DESCRIPTION = "Five or More is a game where one must align colored pieces as the \
board gets filled with randomly placed pieces. When five or more \
pieces of the same color get lined up, they disappear. The game ends \
when the board gets filled up all the way. \
 \
This package contains the help documentation for Five or More."
LICENSE = "GPL-2.0-or-later"

PV = "3.32.3"

RPM_NAME = "five-or-more-doc-3.32.3-1.7.noarch.rpm"
RPM_HASH = "53452c55355a4cf16d84ad5396f281e289b0625f69efcb9ed4fc707b68561f9c67dbbf7349868d6992fa495255e170fb444098f6261ff31aaaaad78892838f5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "five-or-more-doc"

RDEPENDS:${PN} += ""

inherit rpm
