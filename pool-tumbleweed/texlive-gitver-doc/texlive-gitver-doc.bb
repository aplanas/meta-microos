SUMMARY = "Documentation for texlive-gitver"
DESCRIPTION = "This package includes the documentation for texlive-gitver"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn63920"

RPM_NAME = "texlive-gitver-doc-2023.209.1.4svn63920-54.1.noarch.rpm"
RPM_HASH = "5ae73bc23bb08b5f7c295169a5a5d695e0c5fd0bd3e7639d96dc968f88aa5bbef95e8544f6d3acd0c71e34a50a567284f5a329eeecd9b1a36746d5377c83b66a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitver-doc"

RDEPENDS:${PN} += ""

inherit rpm
