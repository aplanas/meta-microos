SUMMARY = "Documentation for texlive-rrgtrees"
DESCRIPTION = "This package includes the documentation for texlive-rrgtrees"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn27322"

RPM_NAME = "texlive-rrgtrees-doc-2023.209.1.1svn27322-54.1.noarch.rpm"
RPM_HASH = "21b6f20cf0a39d27d6716e4b8c2be2b9c30da424077cbe7e692ee69137b65f47544a36e5ed1324856b7e9811e0939839dc3300b92492dff85751cf4b403b4eb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rrgtrees-doc"

RDEPENDS:${PN} += ""

inherit rpm
