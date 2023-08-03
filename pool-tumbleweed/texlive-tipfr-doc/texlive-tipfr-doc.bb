SUMMARY = "Documentation for texlive-tipfr"
DESCRIPTION = "This package includes the documentation for texlive-tipfr"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn38646"

RPM_NAME = "texlive-tipfr-doc-2023.209.1.5svn38646-53.1.noarch.rpm"
RPM_HASH = "bbd11deb6e0f94ad48385ae5e2800457add9b40f1cca7603ab5826013a52751b05378622757cf9fe0de10f91ab970bf7b08443d9eb59469275743aaa2d141d10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tipfr-doc-fr \
texlive-tipfr-doc"

RDEPENDS:${PN} += ""

inherit rpm
