SUMMARY = "A LaTeX git wrapper"
DESCRIPTION = "This package provides several macros to fetch git information \
and typeset it. The macros defined by LaTeXgit can be helpful \
to documentation authors and others to whom clear document \
versioning is important."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn54811"

RPM_NAME = "texlive-latexgit-2023.201.svn54811-54.1.noarch.rpm"
RPM_HASH = "50ed6b369b4f845ff590e4a637df55aefa4d991b303084cdc2ab14fda00d2619ed531004ab76eeb07992a39d7c1b069e2200830cdbd71e7bf30c6632e0cca292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(latexgit.sty) \
texlive-latexgit"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(datetime.sty) \
tex(pgfkeys.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
