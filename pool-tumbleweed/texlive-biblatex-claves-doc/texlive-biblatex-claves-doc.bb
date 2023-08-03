SUMMARY = "Documentation for texlive-biblatex-claves"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-claves"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.1svn43723"

RPM_NAME = "texlive-biblatex-claves-doc-2023.209.1.2.1svn43723-54.1.noarch.rpm"
RPM_HASH = "a407b9ed024f869bed0ba329bc8d9740da2ad252950e489e5d7ffcd6d6f332f75dc6cc820ff466125e1dc02160dd7ba45c0fd61576fd34142011bfa419fa00c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-claves-doc"

RDEPENDS:${PN} += ""

inherit rpm
