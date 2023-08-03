SUMMARY = "Documentation for texlive-12many"
DESCRIPTION = "This package includes the documentation for texlive-12many"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn15878"

RPM_NAME = "texlive-12many-doc-2023.209.0.0.3svn15878-55.1.noarch.rpm"
RPM_HASH = "74a924a77a773d289a3fe2e514a1a1c6fc8dfd06e716682c1b83448ebad2e48df469e4cfe3a9755be3817ea9addd3118675f2aecb66871bae7feb4006f3afd3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-12many-doc"

RDEPENDS:${PN} += ""

inherit rpm
