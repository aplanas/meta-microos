SUMMARY = "Documentation for texlive-pst-rputover"
DESCRIPTION = "This package includes the documentation for texlive-pst-rputover"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn44724"

RPM_NAME = "texlive-pst-rputover-doc-2023.201.1.0svn44724-53.1.noarch.rpm"
RPM_HASH = "1b2f6e0f90833b1f7599f209fcdd684a12e3b7394a688b5558882230379e71358ba0e65a446decc054147b11e03f9b8725580761d36c86444e44a8ea27e50476"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-rputover-doc"

RDEPENDS:${PN} += ""

inherit rpm
