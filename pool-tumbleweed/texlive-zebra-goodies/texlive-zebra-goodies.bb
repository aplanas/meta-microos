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

PV = "2023.201.0.0.8.0svn51554"

RPM_NAME = "texlive-zebra-goodies-2023.201.0.0.8.0svn51554-52.1.noarch.rpm"
RPM_HASH = "41822b20183472ee97c916ca2dfdcdf8f50da53278e0c259276dded559f064655ba2123d954fdd97be4d46d56ba8942990643bd0d26169bba0710b25770bc9ae"
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
