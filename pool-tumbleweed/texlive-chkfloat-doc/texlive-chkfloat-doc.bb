SUMMARY = "Documentation for texlive-chkfloat"
DESCRIPTION = "This package includes the documentation for texlive-chkfloat"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn27473"

RPM_NAME = "texlive-chkfloat-doc-2023.209.0.0.1svn27473-54.1.noarch.rpm"
RPM_HASH = "e359973297f17ba15171c2a0cb31996da91e71284f8eb8c0a8c5683f7545fc94066648d1333946ea4e677ee55bde0ece5ff07f2623accbaef92be3f3958f6d42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chkfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
