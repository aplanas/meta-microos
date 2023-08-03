SUMMARY = "Documentation for texlive-algxpar"
DESCRIPTION = "This package includes the documentation for texlive-algxpar"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.91svn56006"

RPM_NAME = "texlive-algxpar-doc-2023.209.0.0.91svn56006-55.1.noarch.rpm"
RPM_HASH = "dac7af9893c5a5d40acfa8957e5ce8e3cab57461d589ed26ca33dca137f5eca53c83bd87879633355bbda90d20275c19cadcadd1bceddc4923ee900ac1789aaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-algxpar-doc"

RDEPENDS:${PN} += ""

inherit rpm
