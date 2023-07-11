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

RPM_NAME = "texlive-xevlna-2023.201.1.1svn43864-52.2.noarch.rpm"
RPM_HASH = "c8bb972b9e047556a11f633afc0ef1fdd4d5171d74bfeebac06d4563d5e0b1c6e37a21f749f74bc7a64cbaa0591ec3ecaf8c37a990fec924d6ca85012c199265"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xevlna.sty \
texlive-xevlna"

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
