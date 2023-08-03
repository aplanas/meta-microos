SUMMARY = "Documentation for texlive-datetime2-turkish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-turkish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn52331"

RPM_NAME = "texlive-datetime2-turkish-doc-2023.209.1.1svn52331-53.1.noarch.rpm"
RPM_HASH = "738e81dca3b55bc4cae3c22031e9c4b6e4bf074168f4cf26810cd528ce4918fb97836605b401e28e73c3f2f98dec1548031c4dc94db4edddb5fdc3ccd26b6548"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-turkish-doc"

RDEPENDS:${PN} += ""

inherit rpm
