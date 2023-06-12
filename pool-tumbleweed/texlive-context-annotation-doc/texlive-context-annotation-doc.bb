SUMMARY = "Documentation for texlive-context-annotation"
DESCRIPTION = "This package includes the documentation for texlive-context-annotation"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-annotation-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "6d8f913760d314c829e82be1084a671c24f2978279510b30be32246c3c07aebc23fdd9f79d4d354d54a3b7e7216261046792cedbe0e977b5e5638cf286bf342d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-annotation-doc"
RDEPENDS:${PN} += ""

inherit rpm
