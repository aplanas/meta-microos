SUMMARY = "Documentation for texlive-bbold-type1"
DESCRIPTION = "This package includes the documentation for texlive-bbold-type1"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn33143"

RPM_NAME = "texlive-bbold-type1-doc-2023.209.svn33143-54.1.noarch.rpm"
RPM_HASH = "d2a1948b4d75b5357d15b9f54b98604fbe47cb82e4fc40d78ce003dcdaf01e8b19d4e4bb95c811db70f694ee1b15ff4d6a2a3575788765fbd84766ad114c4192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bbold-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
