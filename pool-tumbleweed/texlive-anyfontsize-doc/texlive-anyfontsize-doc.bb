SUMMARY = "Documentation for texlive-anyfontsize"
DESCRIPTION = "This package includes the documentation for texlive-anyfontsize"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17050"

RPM_NAME = "texlive-anyfontsize-doc-2023.209.svn17050-55.1.noarch.rpm"
RPM_HASH = "334c48ba115d5cb6dcd2b77d050ca6e010b54460c0a55bd9913fe02b2e785f03f77b158a05275341ea424ceb2503a6ed04db203c0b700dc8d4f799c5f2a6797d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-anyfontsize-doc"

RDEPENDS:${PN} += ""

inherit rpm
