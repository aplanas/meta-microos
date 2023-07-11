SUMMARY = "Documentation for texlive-pst-venn"
DESCRIPTION = "This package includes the documentation for texlive-pst-venn"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn49316"

RPM_NAME = "texlive-pst-venn-doc-2023.201.0.0.01svn49316-53.2.noarch.rpm"
RPM_HASH = "728806b696c2ca2b63c71d718bd6c8a36180b08c298ab9a27d0559ef706cb019b9b22937701776a072a7cd9530163be30d6961bf8f569a6ca5f6eb12c38594dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-venn-doc"

RDEPENDS:${PN} += ""

inherit rpm
