SUMMARY = "Documentation for texlive-pst-thick"
DESCRIPTION = "This package includes the documentation for texlive-pst-thick"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn16369"

RPM_NAME = "texlive-pst-thick-doc-2023.209.1.0svn16369-54.1.noarch.rpm"
RPM_HASH = "3d494cb482d0832c5cb55badbfdf1664a529ad613c514ee9ce2baf7e2fa8413a1bd7648147c7eac285103de020593a68f64babb05f1a758fe3ca64be00fbaa8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-thick-doc-fr \
texlive-pst-thick-doc"

RDEPENDS:${PN} += ""

inherit rpm
