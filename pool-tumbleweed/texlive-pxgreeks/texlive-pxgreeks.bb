SUMMARY = "Shape selection for PX fonts Greek letters"
DESCRIPTION = "The package allows LaTeX maths users of the PX fonts to select \
the shapes (italic or upright) for the Greek lowercase and \
uppercase letters. Once the shapes for lowercase and uppercase \
have been selected via a package option, the \\other prefix \
(e.g., \\otheralpha) allows using the alternate glyph (as in the \
fourier package). The pxgreeks package does not constrain the \
text font that may be used in the document."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn21838"

RPM_NAME = "texlive-pxgreeks-2023.209.1.0svn21838-54.1.noarch.rpm"
RPM_HASH = "6b918fcc4c8cb4b1d91d9bffbf3902cd13438788b626c1d96168b469570037b27dde22a966e39cd220cd40f7205c33ad1ed9720dc8924b92e0998929e65a2b33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pxgreeks.sty \
texlive-pxgreeks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pxfonts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
