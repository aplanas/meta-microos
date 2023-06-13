SUMMARY = "Documentation for texlive-context-cmscbf"
DESCRIPTION = "This package includes the documentation for texlive-context-cmscbf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-cmscbf-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "e87fb2b96c21a2801d57c07a329eb2a3760b7445c2eb9a1b130900a4a83285081357f86ab9a08312192c4a4b865616ce7a3d7d1425390d1f006f47477903038a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-cmscbf-doc"

RDEPENDS:${PN} += ""

inherit rpm
