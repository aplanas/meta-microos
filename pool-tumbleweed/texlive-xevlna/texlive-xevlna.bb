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

PV = "2023.209.1.1svn43864"

RPM_NAME = "texlive-xevlna-2023.209.1.1svn43864-53.1.noarch.rpm"
RPM_HASH = "d68cf841c29058d0715a62ca7841306884bd24e397aadd134c3687dd13391daca9c8b12a5d349607815b89435e931f8ab16f055fa98b968b3f545e347e4698ee"
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
