SUMMARY = "Documentation for texlive-pst-poly"
DESCRIPTION = "This package includes the documentation for texlive-pst-poly"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.63svn35062"

RPM_NAME = "texlive-pst-poly-doc-2023.209.1.63svn35062-54.1.noarch.rpm"
RPM_HASH = "12480379fb7b2ea737ae7cca65a26c2b1dfb28fbe5d78b50e1f301c12bc398ff13f5d5b17b3dbdb7432c0048b5d8ecd02c445cf2a27b7f9c6921252d5cd9c10c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-poly-doc"

RDEPENDS:${PN} += ""

inherit rpm
