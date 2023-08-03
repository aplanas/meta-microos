SUMMARY = "Documentation for texlive-atenddvi"
DESCRIPTION = "This package includes the documentation for texlive-atenddvi"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn56922"

RPM_NAME = "texlive-atenddvi-doc-2023.209.1.5svn56922-54.1.noarch.rpm"
RPM_HASH = "eba10b173c50e03bdf2718f86c758d23889f8a5dba33f66de1a12b09c30e616b4b2ffca073972ccd6a0afef890eb440e26ca400b52e2c244651552197ea46998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-atenddvi-doc"

RDEPENDS:${PN} += ""

inherit rpm
