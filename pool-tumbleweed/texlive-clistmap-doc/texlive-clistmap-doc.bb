SUMMARY = "Documentation for texlive-clistmap"
DESCRIPTION = "This package includes the documentation for texlive-clistmap"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn61811"

RPM_NAME = "texlive-clistmap-doc-2023.209.1.2svn61811-54.1.noarch.rpm"
RPM_HASH = "9c5416a2b2f4b49961207e8be1a1959c36011b1eb9ae4e66eda8505edb28852ce874b61058ea90bf17619d1c7ced5462961a43cc9ce0123424312fa4f332e3c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clistmap-doc"

RDEPENDS:${PN} += ""

inherit rpm
