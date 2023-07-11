SUMMARY = "Documentation for texlive-hobby"
DESCRIPTION = "This package includes the documentation for texlive-hobby"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn44474"

RPM_NAME = "texlive-hobby-doc-2023.201.1.8svn44474-53.2.noarch.rpm"
RPM_HASH = "38fd9e3a71af076f1a9312ba73402a9d8729c55fa546eb77e4f85d16ce6af78b8e81f0200dce3e3cc259c1f2354b503e0a4de565d6408ea038a4e3a9f0d89295"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hobby-doc"

RDEPENDS:${PN} += ""

inherit rpm
