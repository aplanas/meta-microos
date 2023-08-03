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

PV = "2023.209.1.0svn21328"

RPM_NAME = "texlive-facsimile-2023.209.1.0svn21328-53.1.noarch.rpm"
RPM_HASH = "f09edb7bbacfc7db4466e58530bde7cd81c514f6d54365aa902ca39973644559ee4c122e504a4a5637f6517e97b467747831d9d1ff3bf31f6550caca55b84313"
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
