SUMMARY = "Documentation for texlive-heuristica"
DESCRIPTION = "This package includes the documentation for texlive-heuristica"
LICENSE = "OFL-1.1"

PV = "2023.201.1.092svn51362"

RPM_NAME = "texlive-heuristica-doc-2023.201.1.092svn51362-53.1.noarch.rpm"
RPM_HASH = "90818f01b9cc54a0e5bfc0a782878836eec1878fbaedd49174f31ef4c10bc59ec9820614f14c5db15faee63754569cc908803a69233985a896a9b9c88d9c649d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-heuristica-doc"

RDEPENDS:${PN} += ""

inherit rpm
