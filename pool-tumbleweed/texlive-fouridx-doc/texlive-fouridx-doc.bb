SUMMARY = "Documentation for texlive-fouridx"
DESCRIPTION = "This package includes the documentation for texlive-fouridx"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.00svn32214"

RPM_NAME = "texlive-fouridx-doc-2023.201.2.00svn32214-52.1.noarch.rpm"
RPM_HASH = "bfd9e8a1c975425e8944da7ea8991a2ddc8c40fadeae7aa4cae01128c33cdb9923e8b04d553f6990d9b4fdaf92c7b4181f6f414f153434fb1e947cb9c55e537a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fouridx-doc"

RDEPENDS:${PN} += ""

inherit rpm
