SUMMARY = "Documentation for texlive-coolthms"
DESCRIPTION = "This package includes the documentation for texlive-coolthms"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn29062"

RPM_NAME = "texlive-coolthms-doc-2023.209.1.2svn29062-55.1.noarch.rpm"
RPM_HASH = "30962fb7eb9da7029a92a8d041694d4882d223df15410618bc364e0be5c8cf13599e7d28a1c68bacbb3e7180839ae2d308b8af2b1e75c6c41aa3625a4f60949d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coolthms-doc"

RDEPENDS:${PN} += ""

inherit rpm
