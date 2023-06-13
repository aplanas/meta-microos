SUMMARY = "Insert non-breakable spaces using XeTeX"
DESCRIPTION = "The package will directly insert nonbreakable spaces (in Czech, \
vlna or vlnka), after nonsyllabic prepositions and single \
letter conjuctions, while the document is being typeset. (The \
macros recognised maths and verbatim by TeX means.) (Inserting \
nonbreakable spaces by a preprocessor will probably never be \
fully reliable, because user defined macros and environments \
cannot reliably be recognised.) The package works both with \
(Plain) XeTeX and with XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn43864"

RPM_NAME = "texlive-xevlna-2023.201.1.1svn43864-52.1.noarch.rpm"
RPM_HASH = "96c8ceb4d8b17ea37d8e940ba58bcd87448ec639a2e0797e4f8679c5ba530db321c7c564718972268a87a0d82bc564e5380d35de74151e7d1423f53bfc618ce1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xevlna.sty) \
texlive-xevlna"

RDEPENDS:${PN} += "/bin/sh \
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
