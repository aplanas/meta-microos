SUMMARY = "Documentation for texlive-xkcdcolors"
DESCRIPTION = "This package includes the documentation for texlive-xkcdcolors"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn54512"

RPM_NAME = "texlive-xkcdcolors-doc-2023.201.1.0.1svn54512-52.2.noarch.rpm"
RPM_HASH = "476ed56d2d34d36c8609a510ee53871283df700c62ac0b8257a4c20952c8e261fa081b46945e9fc8f7d3ea588128bf8e8999986162be65a436b996b1da0943ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xkcdcolors-doc"

RDEPENDS:${PN} += ""

inherit rpm
