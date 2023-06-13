SUMMARY = "Documentation for texlive-babel-bosnian"
DESCRIPTION = "This package includes the documentation for texlive-babel-bosnian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn38174"

RPM_NAME = "texlive-babel-bosnian-doc-2023.201.1.1svn38174-53.1.noarch.rpm"
RPM_HASH = "577afc733f156deb18bcb585008af20ea33405df15837ee286cf84d439508970982174c5ebe68ad748ade014f15ea53a87eff2093a57b5289e3f9e90e617857d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-bosnian-doc"

RDEPENDS:${PN} += ""

inherit rpm
