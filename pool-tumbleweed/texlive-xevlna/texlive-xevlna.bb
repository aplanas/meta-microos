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

RPM_NAME = "texlive-xevlna-2023.209.1.1svn43864-53.2.noarch.rpm"
RPM_HASH = "f0ecdfe9c8330f8a02af0fda256dd39875f95468dde780003b987f6ee397fe1ad790ee86d537b265d3989afb643cdef4740ccb587065470af357bf61c5b746cc"
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
