SUMMARY = "Shape selection for PX fonts Greek letters"
DESCRIPTION = "The package allows LaTeX maths users of the PX fonts to select \
the shapes (italic or upright) for the Greek lowercase and \
uppercase letters. Once the shapes for lowercase and uppercase \
have been selected via a package option, the \\other prefix \
(e.g., \\otheralpha) allows using the alternate glyph (as in the \
fourier package). The pxgreeks package does not constrain the \
text font that may be used in the document."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn21838"

RPM_NAME = "texlive-pxgreeks-2023.201.1.0svn21838-53.2.noarch.rpm"
RPM_HASH = "ac159918b707bc0add6c828da3a6d2db3aecd9287905d06ba757058bb520de5c8bc5391d58c20a6d79bdaf462fa086a4a65184915ae69dc9137f2043c883e6ac"
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
