SUMMARY = "Documentation for texlive-texvc"
DESCRIPTION = "This package includes the documentation for texlive-texvc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn46844"

RPM_NAME = "texlive-texvc-doc-2023.201.1.1svn46844-54.1.noarch.rpm"
RPM_HASH = "9eae98b48ac5268018fd2bb7fb80fa57af5e44ea3b7b3e5b52d8fd29aa584ca27fcb9663fc709b57f292b550df225115f92207804a147465c0519a04fe7be580"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texvc-doc"

RDEPENDS:${PN} += ""

inherit rpm
