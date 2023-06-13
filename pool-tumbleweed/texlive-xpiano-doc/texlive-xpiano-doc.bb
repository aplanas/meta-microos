SUMMARY = "Documentation for texlive-xpiano"
DESCRIPTION = "This package includes the documentation for texlive-xpiano"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn61719"

RPM_NAME = "texlive-xpiano-doc-2023.201.1.0svn61719-52.1.noarch.rpm"
RPM_HASH = "3ea133840a17673c506eccace4ab5f063c20c25c7d37fe943ab004139dc184859309339d466ad82cd7e069a1fb1a64eaf8cb45b7c9c66fb2a2679b30c3efdfbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpiano-doc"

RDEPENDS:${PN} += ""

inherit rpm
