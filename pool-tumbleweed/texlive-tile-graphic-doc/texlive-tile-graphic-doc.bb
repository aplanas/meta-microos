SUMMARY = "Documentation for texlive-tile-graphic"
DESCRIPTION = "This package includes the documentation for texlive-tile-graphic"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn55325"

RPM_NAME = "texlive-tile-graphic-doc-2023.201.svn55325-52.1.noarch.rpm"
RPM_HASH = "09ca2ebfa117ee3ef79463519fd11ae720c9515c56218f932d8a05f1762808f28e3cadf810e151e46ca7aa4103cc494cd8a180c14d480e7563cacf2cd1462346"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tile-graphic-doc"

RDEPENDS:${PN} += ""

inherit rpm
