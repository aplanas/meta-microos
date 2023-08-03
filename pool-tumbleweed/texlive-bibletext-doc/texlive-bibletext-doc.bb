SUMMARY = "Documentation for texlive-bibletext"
DESCRIPTION = "This package includes the documentation for texlive-bibletext"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.2svn45196"

RPM_NAME = "texlive-bibletext-doc-2023.209.0.0.1.2svn45196-54.1.noarch.rpm"
RPM_HASH = "13446cfef122bd756e429a7f2d7eb493c1941c8599833bca3381da424ed4a17c2a570aff7b6bedd170a300bcfc5b9512c6644e27948af5389cec03c3b937b57e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibletext-doc"

RDEPENDS:${PN} += ""

inherit rpm
