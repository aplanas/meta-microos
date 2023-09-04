SUMMARY = "Documentation for texlive-dynamicnumber"
DESCRIPTION = "This package includes the documentation for texlive-dynamicnumber"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.3svn38726"

RPM_NAME = "texlive-dynamicnumber-doc-2023.209.0.0.1.3svn38726-54.2.noarch.rpm"
RPM_HASH = "40d1d2cf3cf285b608c1abec6d1b898b2eee2d1bb5ed8d29b3fbb91a2a6986cd96837754c1cf51651e784c0e2b042da549f9e472ae8184b49aec4aa3792915b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dynamicnumber-doc"

RDEPENDS:${PN} += ""

inherit rpm
