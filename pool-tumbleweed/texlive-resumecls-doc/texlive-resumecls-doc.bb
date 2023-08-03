SUMMARY = "Documentation for texlive-resumecls"
DESCRIPTION = "This package includes the documentation for texlive-resumecls"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.1svn54815"

RPM_NAME = "texlive-resumecls-doc-2023.209.0.0.4.1svn54815-54.1.noarch.rpm"
RPM_HASH = "0f501f5515284f0b6d844454a99fd8a29bd8819a9d2c7d4e91e491de7ef4f712c2ddbe10180277cece121c846bb3cf13fb7a9bd936a7deb339b7b7c2f556af2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-resumecls-doc"

RDEPENDS:${PN} += ""

inherit rpm
