SUMMARY = "Documentation for texlive-lmake"
DESCRIPTION = "This package includes the documentation for texlive-lmake"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn25552"

RPM_NAME = "texlive-lmake-doc-2023.201.1.0svn25552-54.1.noarch.rpm"
RPM_HASH = "3818102e02663641bece9b1bb2f7773eb1291e1ff9ead0b54850bb3d54fb70189e86b8c5dc5de3b968c90d992082edca4d48395cdb50af60916f8fd6772f138f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lmake-doc"
RDEPENDS:${PN} += ""

inherit rpm
