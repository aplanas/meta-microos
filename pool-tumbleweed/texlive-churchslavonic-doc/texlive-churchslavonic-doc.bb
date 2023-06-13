SUMMARY = "Documentation for texlive-churchslavonic"
DESCRIPTION = "This package includes the documentation for texlive-churchslavonic"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.1svn42751"

RPM_NAME = "texlive-churchslavonic-doc-2023.201.0.0.2.1svn42751-53.1.noarch.rpm"
RPM_HASH = "aefc0b14fc0cdd99e2862dd146e3375a98859455f80015fe34a6f5c634cdb6c6f8cacbcb2f96aa3d9f29db15badd2de64f9837f9e0993add8ae61bbecfa90417"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-churchslavonic-doc:ru) \
texlive-churchslavonic-doc"

RDEPENDS:${PN} += ""

inherit rpm
