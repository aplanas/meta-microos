SUMMARY = "Documentation for the 'Five or More' GNOME game"
DESCRIPTION = "Five or More is a game where one must align colored pieces as the \
board gets filled with randomly placed pieces. When five or more \
pieces of the same color get lined up, they disappear. The game ends \
when the board gets filled up all the way. \
 \
This package contains the help documentation for Five or More."
LICENSE = "GPL-2.0-or-later"

PV = "3.32.3"

RPM_NAME = "five-or-more-doc-3.32.3-1.8.noarch.rpm"
RPM_HASH = "410f78ce7077345db98b0975c1f39f8e79ef826b076e75c7ae6450442cab0c9500a1995975a294a4c63a017161c125a5664abe20128dc70ac3025490db2a3707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "five-or-more-doc"

RDEPENDS:${PN} += ""

inherit rpm
