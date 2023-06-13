SUMMARY = "Documentation for texlive-hvfloat"
DESCRIPTION = "This package includes the documentation for texlive-hvfloat"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.45svn65671"

RPM_NAME = "texlive-hvfloat-doc-2023.201.2.45svn65671-52.1.noarch.rpm"
RPM_HASH = "dd7570e4e0e7de8d2d2ab58d28dec98053c8c2edb82a0d7b1630a4cad98f7ed9ee3a11deae85d1983e6ce2aaec3b3012a5103fff88a2e13395ef2a43825d9174"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvfloat-doc"

RDEPENDS:${PN} += "/bin/bash"

inherit rpm
