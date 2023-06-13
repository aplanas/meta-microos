SUMMARY = "Documentation for texlive-doclicense"
DESCRIPTION = "This package includes the documentation for texlive-doclicense"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2.0svn63340"

RPM_NAME = "texlive-doclicense-doc-2023.201.3.2.0svn63340-52.1.noarch.rpm"
RPM_HASH = "97e7d37b675b35e34eb99c4f386f330ebe78c4bfe069bfd638561cc0f306306402031550b93db24204ac2b3b1c4ed70fcf147458f80c6162c3751b3709a5106b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doclicense-doc"

RDEPENDS:${PN} += ""

inherit rpm
