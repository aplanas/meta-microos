SUMMARY = "Examples from Przechlewski's LaTeX book"
DESCRIPTION = "The bundle provides machine-readable copies of the examples \
from the book 'Praca magisterska i dyplomowa z programem \
LaTeX'."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn23552"

RPM_NAME = "texlive-przechlewski-book-2023.201.svn23552-52.1.noarch.rpm"
RPM_HASH = "6fd8ff8a8437710781c9ff3b0f3828829cde10af607abed6182b7305057555d61fac2e522efc898a924cc4ef241baa67234441affb7e892b2a7add201a76cfdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(upmgr.cls) \
tex(wkmgr.cls) \
texlive-przechlewski-book"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(caption.sty) \
tex(graphicx.sty) \
tex(polski.sty) \
tex(prelim2e.sty) \
tex(report.cls) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
