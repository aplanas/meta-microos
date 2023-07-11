SUMMARY = "Documentation for texlive-manuscript"
DESCRIPTION = "This package includes the documentation for texlive-manuscript"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.7svn36110"

RPM_NAME = "texlive-manuscript-doc-2023.208.1.7svn36110-53.1.noarch.rpm"
RPM_HASH = "97476887cb993b91e709d8855d376ba84fe45b41eb297ae66d6328e2009e82f523923fdbdd71630b267f1b3e9fa306e5360b4557ff5585ba6f3e71f454d4b113"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-manuscript-doc"

RDEPENDS:${PN} += ""

inherit rpm
