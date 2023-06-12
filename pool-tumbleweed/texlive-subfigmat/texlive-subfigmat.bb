SUMMARY = "Automates layout when using the subfigure package"
DESCRIPTION = "Defines an array/matrix-type environment that is used with the \
subfigure package to automate the placement of subfigures (or \
tables or text). The subfigures are placed left-to-right, \
top-to-bottom."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn20308"

RPM_NAME = "texlive-subfigmat-2023.201.1.0svn20308-57.1.noarch.rpm"
RPM_HASH = "3738cd68fde5ca9d3400f8009a5c328b58fd79dbfdefdb685b845ed73461f3cab73a1ac34ce2ab50b08c1a52c6faebbfd20ea1beb8ce07b1d761e3567dd54cca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(subfigmat.sty) \
texlive-subfigmat"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(subfigure.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
