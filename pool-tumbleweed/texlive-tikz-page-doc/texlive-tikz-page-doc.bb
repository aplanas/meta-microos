SUMMARY = "Documentation for texlive-tikz-page"
DESCRIPTION = "This package includes the documentation for texlive-tikz-page"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn42039"

RPM_NAME = "texlive-tikz-page-doc-2023.209.1.0svn42039-53.1.noarch.rpm"
RPM_HASH = "1cae48128c55ed25e958cfc99d5448c3a95ad4cfb17c3e742e9bc7afa8f62f2df90f9f50365b8ba9b5680b41fc2a90cc4f57bc59e19b28300aac8007056ebea3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-page-doc"

RDEPENDS:${PN} += ""

inherit rpm
