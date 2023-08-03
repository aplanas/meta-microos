SUMMARY = "Documentation for texlive-realscripts"
DESCRIPTION = "This package includes the documentation for texlive-realscripts"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3dsvn56594"

RPM_NAME = "texlive-realscripts-doc-2023.209.0.0.3dsvn56594-54.1.noarch.rpm"
RPM_HASH = "cf1eac327d51ab7ba114915f9b8e56752e42af7ee6a67c25a361e3009a069fece10d9b902148d7520096096868f73801bcd6e1d35bbe88e3b17b8c776b95a3ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-realscripts-doc"

RDEPENDS:${PN} += ""

inherit rpm
