SUMMARY = "Documentation for texlive-esdiff"
DESCRIPTION = "This package includes the documentation for texlive-esdiff"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn21385"

RPM_NAME = "texlive-esdiff-doc-2023.209.1.2svn21385-54.1.noarch.rpm"
RPM_HASH = "50c46fa0c9c989ea94b56382aecce3ac57680b805368d6e0d8b279febc99f60ae53bf2f6429de39958832b9b01d889e6001b61ecefc8b35849887f1494225ee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esdiff-doc"

RDEPENDS:${PN} += ""

inherit rpm
