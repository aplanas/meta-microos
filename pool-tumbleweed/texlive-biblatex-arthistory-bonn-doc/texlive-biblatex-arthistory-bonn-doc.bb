SUMMARY = "Documentation for texlive-biblatex-arthistory-bonn"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-arthistory-bonn"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn46637"

RPM_NAME = "texlive-biblatex-arthistory-bonn-doc-2023.209.1.2svn46637-54.1.noarch.rpm"
RPM_HASH = "4f265219439ba1baf952b77330cb363458ceea3a085db5ef97434fef9ca7ca780ba6dc640326cc5dab1865c9dbe55812a66e24b6a3a4d87037816dc0ac29f847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-arthistory-bonn-doc"

RDEPENDS:${PN} += ""

inherit rpm
