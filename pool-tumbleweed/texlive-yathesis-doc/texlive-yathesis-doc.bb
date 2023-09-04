SUMMARY = "Documentation for texlive-yathesis"
DESCRIPTION = "This package includes the documentation for texlive-yathesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.11svn66146"

RPM_NAME = "texlive-yathesis-doc-2023.209.1.0.11svn66146-53.2.noarch.rpm"
RPM_HASH = "9ea95bdb5b8c558941c1280d186f2a7387a59851ceffead94acf4c38d6c624a4e0861a833bab3003a9554822668aab29a172ffe19e763789c66c578cad7f2c71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-yathesis-doc-fr \
texlive-yathesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
