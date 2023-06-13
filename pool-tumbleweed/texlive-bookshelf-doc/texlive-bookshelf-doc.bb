SUMMARY = "Documentation for texlive-bookshelf"
DESCRIPTION = "This package includes the documentation for texlive-bookshelf"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn55475"

RPM_NAME = "texlive-bookshelf-doc-2023.201.0.0.5svn55475-52.1.noarch.rpm"
RPM_HASH = "5eab5d85628a486e484cc66fe05ad512be9bd0f2c9d497003a1e185c419a082b410c70b03d9d689146e23bbf334fd26b73879d032e8f7aaef9e250bff7924559"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bookshelf-doc"

RDEPENDS:${PN} += ""

inherit rpm
