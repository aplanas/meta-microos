SUMMARY = "Documentation for texlive-dsptricks"
DESCRIPTION = "This package includes the documentation for texlive-dsptricks"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn34724"

RPM_NAME = "texlive-dsptricks-doc-2023.209.1.0svn34724-53.1.noarch.rpm"
RPM_HASH = "867a6e0e1bb1e362f1074b5e8afab6b3db5bdc7fa6f1a847dd27e07002605ad27037296a1cfe1965a75cf06f35da3ff4ed7ad71bedc6a7330b76883217d8fde1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dsptricks-doc"

RDEPENDS:${PN} += ""

inherit rpm
