SUMMARY = "Documentation for texlive-rojud"
DESCRIPTION = "This package includes the documentation for texlive-rojud"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn56895"

RPM_NAME = "texlive-rojud-doc-2023.209.1.2svn56895-54.1.noarch.rpm"
RPM_HASH = "e176af2d10bb51e327d90e519ebc7973451013bf18c9fbab98d26a943d7248475e27cc5bbebf26e5c76e73237329a5a59cce5ea1e34f6cf4aad1643073b4eb28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rojud-doc"

RDEPENDS:${PN} += ""

inherit rpm
