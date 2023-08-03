SUMMARY = "Documentation for texlive-mf2pt1"
DESCRIPTION = "This package includes the documentation for texlive-mf2pt1"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn61217"

RPM_NAME = "texlive-mf2pt1-doc-2023.209.2.7svn61217-55.1.noarch.rpm"
RPM_HASH = "dc892e44e3f5e519fda73c199127fbf252c6fcbb1bf421ee23d2418a254389d8e92454b1f76a2832fb477dcd2375ff8b225fcb666173d875dd885e1c841caca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mf2pt1-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
