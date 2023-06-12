SUMMARY = "Documentation for texlive-multenum"
DESCRIPTION = "This package includes the documentation for texlive-multenum"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21775"

RPM_NAME = "texlive-multenum-doc-2023.201.svn21775-54.1.noarch.rpm"
RPM_HASH = "2fe6d357df0bb7ee7a42191afaaaef8a4f68ca74ab7300eed1a12df84b3d66d00983cf51c651a09516e529fff6b9f747b261059e79780f9cc59cd0ac96e37f88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multenum-doc"
RDEPENDS:${PN} += ""

inherit rpm
