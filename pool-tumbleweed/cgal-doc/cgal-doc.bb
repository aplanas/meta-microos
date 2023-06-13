SUMMARY = "Documentation CGAL algorithms"
DESCRIPTION = "This package provides the documentation for CGAL algorithms."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "5.5.2"

RPM_NAME = "cgal-doc-5.5.2-2.1.noarch.rpm"
RPM_HASH = "bfc1008821e634bbca7f07003b3d744c4d1a827a628cb695593f4e2dfd9a93155b2b2319531ef8b2b287e126419e316d2fe2dfe478b7a6cd1755a32baebaf971"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cgal-doc"

RDEPENDS:${PN} += ""

inherit rpm
