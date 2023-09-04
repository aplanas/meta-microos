SUMMARY = "Documentation for texlive-inriafonts"
DESCRIPTION = "This package includes the documentation for texlive-inriafonts"
LICENSE = "OFL-1.1"

PV = "2023.209.1.0svn54512"

RPM_NAME = "texlive-inriafonts-doc-2023.209.1.0svn54512-54.1.noarch.rpm"
RPM_HASH = "2ee14b9be1917c15ef02eeaee3c689d2d5c483c45b47f6e9dcf7a2079b4eb121c7d29ee4105efd05c6fdf509e12959d80743c7825d61b0e4d7ebabe0f1d6056a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inriafonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
