SUMMARY = "Document class for preparing faxes"
DESCRIPTION = "The facsimile class provides a simple interface for creating a \
document for sending as a fax, with LaTeX. The class covers two \
areas: First, a title page is created with a detailed fax \
header; second, every page gets headers and footers so that the \
recipient can be sure that every page has been received and all \
pages are complete, and in the correct order. The class evolved \
from the fax package, and provides much better language \
support."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn21328"

RPM_NAME = "texlive-facsimile-2023.201.1.0svn21328-52.1.noarch.rpm"
RPM_HASH = "595eb494315b0d42852a2e2d7499f124b0615c75a4fd07ae4eef8d419718381c5bda600d24ddf8b2eea9723e35583147d9ea52fcb473c9d6beee67f0f4a0ff78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fac-de.cfg \
tex-fac-en.cfg \
tex-facsimile.cls \
texlive-facsimile"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-lastpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
