SUMMARY = "Documentation for texlive-endnotesj"
DESCRIPTION = "This package includes the documentation for texlive-endnotesj"
LICENSE = "BSD-3-Clause"

PV = "2023.201.3.0svn47703"

RPM_NAME = "texlive-endnotesj-doc-2023.201.3.0svn47703-53.2.noarch.rpm"
RPM_HASH = "6a4d5f8927942d1f765e66677bc8884b3d8ae7bce57f92026e130fbf490a849d545ff4f67768202571bb6b97ebe6f0492705069d3fa0c563c549d1ab78f31024"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-endnotesj-doc-ja \
texlive-endnotesj-doc"

RDEPENDS:${PN} += ""

inherit rpm
