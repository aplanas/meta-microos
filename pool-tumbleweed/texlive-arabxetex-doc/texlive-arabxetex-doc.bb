SUMMARY = "Documentation for texlive-arabxetex"
DESCRIPTION = "This package includes the documentation for texlive-arabxetex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.1svn38299"

RPM_NAME = "texlive-arabxetex-doc-2023.209.1.2.1svn38299-55.1.noarch.rpm"
RPM_HASH = "b99da8bf0303e122df45f546d7f93dbf92b5176beae5b650d393d2b0e8d6d8305f0ff52e0215d55c1fde96d346e1efac25e4e1bb068d591aa7858547888e2c9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arabxetex-doc"

RDEPENDS:${PN} += ""

inherit rpm
