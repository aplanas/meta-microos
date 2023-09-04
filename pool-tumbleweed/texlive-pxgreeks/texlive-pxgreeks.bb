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

RPM_NAME = "texlive-pxgreeks-2023.209.1.0svn21838-54.2.noarch.rpm"
RPM_HASH = "2741281ff07b52fce3a6f128e2145fff0dec823dcc61c24c6b86fd88ad503374731c243cb183aac79b255aa47d0d82ad1f435348e23a065565a15f0ac5bf3ee3"
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
