SUMMARY = "Documentation for texlive-fetchcls"
DESCRIPTION = "This package includes the documentation for texlive-fetchcls"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn45245"

RPM_NAME = "texlive-fetchcls-doc-2023.209.1.0svn45245-53.1.noarch.rpm"
RPM_HASH = "c88242ced951a1103a47c5d608437bfb3d2c659a72b52ca7acc80ac1e58be65e52541d7563ac636e36ec1eb780a326b274fd7a0b2395b422be3d21f3f4a6e81f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fetchcls-doc"

RDEPENDS:${PN} += ""

inherit rpm
