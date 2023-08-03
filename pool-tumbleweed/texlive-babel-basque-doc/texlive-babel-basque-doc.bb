SUMMARY = "Documentation for texlive-babel-basque"
DESCRIPTION = "This package includes the documentation for texlive-babel-basque"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0fsvn30256"

RPM_NAME = "texlive-babel-basque-doc-2023.209.1.0fsvn30256-54.1.noarch.rpm"
RPM_HASH = "0714f3b9d7a23c670d6baa4a312208c98ac826b851c734459460bf93e2aa2859d30ddf307ef25938a9acf86c65c3392b12eb81cd72c4d3b384958f5a978e500a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-basque-doc"

RDEPENDS:${PN} += ""

inherit rpm
