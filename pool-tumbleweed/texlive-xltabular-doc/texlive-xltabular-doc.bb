SUMMARY = "Documentation for texlive-xltabular"
DESCRIPTION = "This package includes the documentation for texlive-xltabular"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2esvn56855"

RPM_NAME = "texlive-xltabular-doc-2023.209.0.0.2esvn56855-53.1.noarch.rpm"
RPM_HASH = "5e3baa8ea06e2b5193a06a2ae1722dad88c96ab8d66f53e725b0947c8f0bf541b2aad6d1a43f0db82dc2c4d9c367a1d638a139552976575fe0e1366ebbbd1b73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xltabular-doc"

RDEPENDS:${PN} += ""

inherit rpm
