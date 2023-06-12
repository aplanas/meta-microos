SUMMARY = "Documentation for texlive-hologo"
DESCRIPTION = "This package includes the documentation for texlive-hologo"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.15svn61719"

RPM_NAME = "texlive-hologo-doc-2023.201.1.15svn61719-53.1.noarch.rpm"
RPM_HASH = "1853f6825585ed880d78458eb7300295923ad12ae314433f72015e5d1fe5ff6b35a0df545bd2d4450e66a430410e3338e7025aa26b4aa4cb87365efd2726ad69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hologo-doc"
RDEPENDS:${PN} += ""

inherit rpm
