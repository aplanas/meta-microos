SUMMARY = "Documentation for texlive-globalvals"
DESCRIPTION = "This package includes the documentation for texlive-globalvals"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn49962"

RPM_NAME = "texlive-globalvals-doc-2023.201.1.1svn49962-53.2.noarch.rpm"
RPM_HASH = "909e8a171e5bc059a7b1dac1c1dd81a3c2d118572f539639493bd1ad317f55cb331d8c024f9e2a86b0d3de68b26971992c10f17a2a04e483821c10d98e879b33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-globalvals-doc"

RDEPENDS:${PN} += ""

inherit rpm
