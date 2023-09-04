SUMMARY = "Documentation for texlive-xesearch"
DESCRIPTION = "This package includes the documentation for texlive-xesearch"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn51908"

RPM_NAME = "texlive-xesearch-doc-2023.209.0.0.2svn51908-53.2.noarch.rpm"
RPM_HASH = "a214780065aa254249dd4e5b61a6f899d9b4bbbc88d464f477719daa3295ee81c80cc83af5809de0aa7da884162f3ec8d1f21b948ed8fe2e52e78139049fd439"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xesearch-doc"

RDEPENDS:${PN} += ""

inherit rpm
