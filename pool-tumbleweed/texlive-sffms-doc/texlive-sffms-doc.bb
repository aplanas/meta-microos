SUMMARY = "Documentation for texlive-sffms"
DESCRIPTION = "This package includes the documentation for texlive-sffms"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn15878"

RPM_NAME = "texlive-sffms-doc-2023.201.2.0svn15878-53.1.noarch.rpm"
RPM_HASH = "2a9b2366064c60b1007a3f222dc5abdadb3132d615ca07d471a62209c2b9c2d16f757f0902834939c56298c8ba4db6fbb24139093ad724516bfcb138aa54b4fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sffms-doc"
RDEPENDS:${PN} += ""

inherit rpm
