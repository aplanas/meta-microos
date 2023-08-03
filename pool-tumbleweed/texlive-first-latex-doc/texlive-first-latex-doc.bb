SUMMARY = "A document for absolute LaTeX beginners"
DESCRIPTION = "The document leads a reader, who knows nothing about LaTeX, \
through the production of a two page document. The user who has \
completed that first document, and wants to carry on, will find \
recommendations for tutorials."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-first-latex-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "1d10dd1201f54f863da645f8e7fd6e14886be61d3d2bee8bd3c340a5ac31c77c62d257e140cd8e78258527f4a6e4bb6bf49f5fd1a00510b932ddd614d84f5b59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-first-latex-doc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
