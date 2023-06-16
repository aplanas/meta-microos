SUMMARY = "Typeset papers conforming to the stylesheet of the Cascadilla Proceedings Project"
DESCRIPTION = "The class provides an extension of the standard LaTeX article \
class that may be used to typeset papers conforming to the \
stylesheet of the Cascadilla Proceedings Project, which is used \
by a number of linguistics conference proceedings (e.g., \
WCCFL)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8.2svn25144"

RPM_NAME = "texlive-cascadilla-2023.201.1.8.2svn25144-52.1.noarch.rpm"
RPM_HASH = "43053e8b089c0622b9001ae1db4fbd1e516443b4a66e67b9e872b2f9d81dad2fb48a1902d2644db0fa2ed03eb85311ca993028b1bd611374223e9f461de8ae00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cascadilla.cls \
texlive-cascadilla"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-caption.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-ifthen.sty \
tex-indentfirst.sty \
tex-natbib.sty \
tex-times.sty \
tex-titlesec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
