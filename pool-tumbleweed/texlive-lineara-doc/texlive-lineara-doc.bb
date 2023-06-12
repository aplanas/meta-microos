SUMMARY = "Documentation for texlive-lineara"
DESCRIPTION = "This package includes the documentation for texlive-lineara"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63169"

RPM_NAME = "texlive-lineara-doc-2023.201.svn63169-54.1.noarch.rpm"
RPM_HASH = "b619dd134242fb8bdbbcb57d7c7d9e15f35d712631fecbcc1fc178e06227332b4b3d0187049e29ddd4eaba77cf6eb888ba2cf6d61ccbecb0a503519cbb82f636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lineara-doc"
RDEPENDS:${PN} += ""

inherit rpm
