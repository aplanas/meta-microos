SUMMARY = "Documentation for texlive-subfig"
DESCRIPTION = "This package includes the documentation for texlive-subfig"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn15878"

RPM_NAME = "texlive-subfig-doc-2023.201.1.3svn15878-57.1.noarch.rpm"
RPM_HASH = "65a608639aa7dd327fb1c7224c2ba1a5653724c6a3af4a6cf4ec1a3fb90b9ab0a1ce743be9cfa2e358c8e03563fd3a49f98301f380aa15ba3abd021b8f7da2a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subfig-doc"

RDEPENDS:${PN} += ""

inherit rpm
