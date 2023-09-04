SUMMARY = "A collection of handy macros for paper writing"
DESCRIPTION = "This package offers a collection of macros to help in the \
process of writing a paper. You may add comments, todo notes, \
etc. during revision, in a colourful way. The package also \
summarizes the inserted notes at the end of the document. There \
are some predefined note commands as well as a way of defining \
new ones to suit the user's needs. You may safely remove this \
package once the paper is finished. This package depends on the \
following other LaTeX packages: kvoptions, manfnt, marginnote, \
tikzpagenodes, xcolor, and, optionally, microtype. Note: \
'zebra' is the name of the package author's lab."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8.0svn51554"

RPM_NAME = "texlive-zebra-goodies-2023.209.0.0.8.0svn51554-53.2.noarch.rpm"
RPM_HASH = "abc4c44b3310cfd5ffc5cc943107090cfe91a740032b58a369d8e6be07a160f5f0ceebc671f1f18cac045429f0afb40ba5626ce877e3c7d74a6c5037c47cbf32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zebra-goodies.sty \
texlive-zebra-goodies"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-manfnt.sty \
tex-marginnote.sty \
tex-microtype.sty \
tex-tikzpagenodes.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
