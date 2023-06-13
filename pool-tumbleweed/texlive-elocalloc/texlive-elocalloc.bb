SUMMARY = "Local allocation macros for LaTeX 2015"
DESCRIPTION = "Local allocation macros, with names taken from etex.sty but \
with implementation based on the LaTeX 2015 allocation macros."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.03svn42712"

RPM_NAME = "texlive-elocalloc-2023.201.0.0.03svn42712-53.1.noarch.rpm"
RPM_HASH = "66d9826aa316b1ca29c0aa5eb16bf31ae75e04ec4a261b13f05ced6eb0d7993ef4ce746edbd627f264ff26ce4a36f9c7ae814109eca7664e160de37a069873da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(elocalloc.sty) \
texlive-elocalloc"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etex.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
