SUMMARY = "Documentation for texlive-gmiflink"
DESCRIPTION = "This package includes the documentation for texlive-gmiflink"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.97svn15878"

RPM_NAME = "texlive-gmiflink-doc-2023.209.0.0.97svn15878-54.1.noarch.rpm"
RPM_HASH = "a395b425ddb74fb0854bff335eb8ad281eb5dcba3d3e640f1b9ee6e7c2ce2ee50be5c2d232d9288d477a31f12bfefbf4cde16ad830f4aea5270f12a3929c0f82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmiflink-doc"

RDEPENDS:${PN} += ""

inherit rpm
