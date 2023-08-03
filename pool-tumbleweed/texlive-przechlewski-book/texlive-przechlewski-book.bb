SUMMARY = "Examples from Przechlewski's LaTeX book"
DESCRIPTION = "The bundle provides machine-readable copies of the examples \
from the book 'Praca magisterska i dyplomowa z programem \
LaTeX'."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn23552"

RPM_NAME = "texlive-przechlewski-book-2023.209.svn23552-53.1.noarch.rpm"
RPM_HASH = "dee492f36c73661c6144d51337a793bf2c976e56e8c1450765eb0166ad566d87a557e86143c91f778558f0c1e0a86bd02dcfbe55cfc9be7a4d1967b0fac514b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-upmgr.cls \
tex-wkmgr.cls \
texlive-przechlewski-book"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption.sty \
tex-graphicx.sty \
tex-polski.sty \
tex-prelim2e.sty \
tex-report.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
