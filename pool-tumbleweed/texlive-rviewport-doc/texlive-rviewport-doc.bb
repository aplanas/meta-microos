SUMMARY = "Documentation for texlive-rviewport"
DESCRIPTION = "This package includes the documentation for texlive-rviewport"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn23739"

RPM_NAME = "texlive-rviewport-doc-2023.209.1.0svn23739-54.1.noarch.rpm"
RPM_HASH = "6c98e634d1c91efa8c04ae01298ac1a4a62e58ee7ac5d26b8975b303b76120521a1bfbd95dcb0cbc40d302b65598753fd49cbae5a934666c4dc362040b67f1b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rviewport-doc"

RDEPENDS:${PN} += ""

inherit rpm
