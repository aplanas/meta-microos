SUMMARY = "Documentation for texlive-xkcdcolors"
DESCRIPTION = "This package includes the documentation for texlive-xkcdcolors"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn54512"

RPM_NAME = "texlive-xkcdcolors-doc-2023.209.1.0.1svn54512-53.1.noarch.rpm"
RPM_HASH = "7c2176a55eaa5357d7e9ac866d56baf62ef9678523436374c2cc02411d9c371fe9b8372055c30c9412a0a8afe143bb048b7cb561f4faa8ded3477e29810bf189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xkcdcolors-doc"

RDEPENDS:${PN} += ""

inherit rpm
