SUMMARY = "Documentation for texlive-libris"
DESCRIPTION = "This package includes the documentation for texlive-libris"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.007svn19409"

RPM_NAME = "texlive-libris-doc-2023.201.1.007svn19409-54.1.noarch.rpm"
RPM_HASH = "15f77eba7816f35cc555cbc068ccf6e52984f7e7f949da91ee48b76d1505d33edb0a1f685809417559a808ec6f3999ce68b6645b1193d13db261c9fde1b63817"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libris-doc"

RDEPENDS:${PN} += ""

inherit rpm
