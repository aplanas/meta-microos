SUMMARY = "Documentation for texlive-pst-3d"
DESCRIPTION = "This package includes the documentation for texlive-pst-3d"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn17257"

RPM_NAME = "texlive-pst-3d-doc-2023.209.1.10svn17257-53.1.noarch.rpm"
RPM_HASH = "4384a202c38b43405ed29ef6ed5f939cd22aea0e5d7d0b95caae6083fafb5bae8df969ce63f1d6d1de1bf79f74a2bbf8396a24ebcfce7f081618b9c554dfc50a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-3d-doc"

RDEPENDS:${PN} += ""

inherit rpm
