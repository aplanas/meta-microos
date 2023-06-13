SUMMARY = "Documentation for texlive-gcite"
DESCRIPTION = "This package includes the documentation for texlive-gcite"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn15878"

RPM_NAME = "texlive-gcite-doc-2023.201.1.0.1svn15878-52.1.noarch.rpm"
RPM_HASH = "674bfab3d407f850bc585f310dad2979cbb5be8dd43d92ab1d7b94edfdd618fbd1eb528d16aa691fe86a4c2a568c16685f55dfe4794cd76ce4ca23e05d077e81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gcite-doc"

RDEPENDS:${PN} += ""

inherit rpm
