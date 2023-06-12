SUMMARY = "Documentation for texlive-libertinus-otf"
DESCRIPTION = "This package includes the documentation for texlive-libertinus-otf"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.29svn60023"

RPM_NAME = "texlive-libertinus-otf-doc-2023.201.0.0.29svn60023-54.1.noarch.rpm"
RPM_HASH = "7e7680f993c5c69a948c64c1598426bdfe6a60d58abafb44a694671b29ff88258e9a42174fd8a387b832de69d4ecc48534033b3deceef7d899f6cef824367143"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertinus-otf-doc"
RDEPENDS:${PN} += ""

inherit rpm
