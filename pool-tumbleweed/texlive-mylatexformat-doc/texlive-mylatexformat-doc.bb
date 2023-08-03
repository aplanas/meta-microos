SUMMARY = "Documentation for texlive-mylatexformat"
DESCRIPTION = "This package includes the documentation for texlive-mylatexformat"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.4svn21392"

RPM_NAME = "texlive-mylatexformat-doc-2023.209.3.4svn21392-55.1.noarch.rpm"
RPM_HASH = "5b684fa7431aeb2bc2572b5271c570609e44b739d1cbececaddcb069cb01b57de65a1707cfde1881c13e4ea5487d9b95c464ef9efb7e704e72400f8daf07473f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mylatexformat-doc"

RDEPENDS:${PN} += ""

inherit rpm
