SUMMARY = "Documentation for texlive-graphicx-psmin"
DESCRIPTION = "This package includes the documentation for texlive-graphicx-psmin"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn56931"

RPM_NAME = "texlive-graphicx-psmin-doc-2023.201.1.2svn56931-53.2.noarch.rpm"
RPM_HASH = "0a96685dd00489d0a671d6d4223b402d9cd1f80ba62e28b893aeaedf30339c3f86be11fed114d72fe100eef12ddfc9a12b6894995eebdc522b55dcf35c2d1b21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphicx-psmin-doc"

RDEPENDS:${PN} += ""

inherit rpm
