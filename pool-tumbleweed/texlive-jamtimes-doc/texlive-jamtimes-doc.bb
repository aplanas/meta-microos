SUMMARY = "Documentation for texlive-jamtimes"
DESCRIPTION = "This package includes the documentation for texlive-jamtimes"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.12svn20408"

RPM_NAME = "texlive-jamtimes-doc-2023.209.1.12svn20408-56.1.noarch.rpm"
RPM_HASH = "b304d99db149bc6bb064a6bf46d21fcc9ab8ff97c5f64c8b56355cefff112f2c2fee8c70fa933ca4f80b05c44bba86a232ef325da107b55b7c2ea316250d2f9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jamtimes-doc"

RDEPENDS:${PN} += ""

inherit rpm
