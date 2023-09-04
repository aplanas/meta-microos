SUMMARY = "Documentation for texlive-xassoccnt"
DESCRIPTION = "This package includes the documentation for texlive-xassoccnt"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn61112"

RPM_NAME = "texlive-xassoccnt-doc-2023.209.2.0svn61112-53.2.noarch.rpm"
RPM_HASH = "200c41e4af106e4a97e9c3ae302413812e60c12a2d159c25a25a4d9210011d5e2f69b1dceced776e878a32709185313072c13481eccf608529fc6b7d12a1ee05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xassoccnt-doc"

RDEPENDS:${PN} += ""

inherit rpm
