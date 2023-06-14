SUMMARY = "Draw framed boxes with standard CSS attributes that can break over multiple pages"
DESCRIPTION = "The longfbox package provides framed boxes that can be \
customized using standard CSS attributes. It was written to \
support precise rendering of Madoko documents in LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn39028"

RPM_NAME = "texlive-longfbox-2023.201.1.0svn39028-54.1.noarch.rpm"
RPM_HASH = "995793ecf639f70bcfbf08d659ac155dd2dcc09dc0094db830bdd47abb3bf550d8bfdc5023f22638f888583662fdee5c6ac08711365f16a1122b208d2091083a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-longbox.sty \
tex-longfbox.sty \
texlive-longfbox"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ellipse.sty \
tex-footnote.sty \
tex-options.sty \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
