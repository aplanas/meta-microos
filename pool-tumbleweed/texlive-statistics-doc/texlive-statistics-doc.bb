SUMMARY = "Documentation for texlive-statistics"
DESCRIPTION = "This package includes the documentation for texlive-statistics"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.2svn52212"

RPM_NAME = "texlive-statistics-doc-2023.201.2.2svn52212-57.1.noarch.rpm"
RPM_HASH = "e73b5b39e5d823224af38c25d6daa879aeda1e525e4da19a72c57f5106da662b22019df5f741b7a0c9cd91e5fd75974f589449dbf7c1930dd613feb9760dcc73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-statistics-doc"
RDEPENDS:${PN} += ""

inherit rpm
