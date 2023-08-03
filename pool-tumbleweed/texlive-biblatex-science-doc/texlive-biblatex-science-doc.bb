SUMMARY = "Documentation for texlive-biblatex-science"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-science"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn48945"

RPM_NAME = "texlive-biblatex-science-doc-2023.209.1.2svn48945-54.1.noarch.rpm"
RPM_HASH = "bf10daed6c2f6646c69d1f609c75448ef91d11109b8184b2214bcc60063521594cf179f00a27dd08015d9ca0c5806ffb723d44bab019fa0b41b70c158adbd153"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-science-doc"

RDEPENDS:${PN} += ""

inherit rpm
