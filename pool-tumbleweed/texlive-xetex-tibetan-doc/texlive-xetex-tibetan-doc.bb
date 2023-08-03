SUMMARY = "Documentation for texlive-xetex-tibetan"
DESCRIPTION = "This package includes the documentation for texlive-xetex-tibetan"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn28847"

RPM_NAME = "texlive-xetex-tibetan-doc-2023.209.0.0.1svn28847-53.1.noarch.rpm"
RPM_HASH = "2d3826198f08d35306dbdf1486a93ad0ef92620c53583f8b4ddf93b6083f7b2aa1b6d2eaf31899cc164ee5d889d3ce4b3ba95c2985d2ccafded8dab10124d867"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetex-tibetan-doc"

RDEPENDS:${PN} += ""

inherit rpm
