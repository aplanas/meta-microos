SUMMARY = "Documentation for texlive-2up"
DESCRIPTION = "This package includes the documentation for texlive-2up"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3asvn55076"

RPM_NAME = "texlive-2up-doc-2023.201.1.3asvn55076-54.1.noarch.rpm"
RPM_HASH = "04d73b5df109d00d3371f210c8a70701b40e6eb96fcce63677b549a80010631af5df33fa6f2383b359a7ab138bd17381543a36c90a5925cde463ed17156a09ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-2up-doc"

RDEPENDS:${PN} += ""

inherit rpm
