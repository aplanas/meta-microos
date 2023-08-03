SUMMARY = "Ensure minimal spacing of table cells"
DESCRIPTION = "It is well known that high or deep cells tend to touch the \
\\hlines of a tabular. This package provides a modifier S acting \
on usual column types so that to ensure a minimal distance that \
can be controlled through two parameters \\cellspacetoplimit and \
\\cellspacebottomlimit. The approach employed by this package is \
noticeably simpler than that of tabls, which considers the \
dimensions of each entire row; whereas you can ask the \
cellspace only to look at the cells of potentially difficult \
columns. The package depends on ifthen, array, calc, and \
xkeyval."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9.0svn61501"

RPM_NAME = "texlive-cellspace-2023.209.1.9.0svn61501-53.1.noarch.rpm"
RPM_HASH = "532897915815edac5795364826a9791b08839078f7bcd18db46fcc4f63d2668930ff71121386773a4c4e402f79d87b3e635d48878773fe7b9051013f58951515"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cellspace.sty \
texlive-cellspace"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-array.sty \
tex-calc.sty \
tex-ifthen.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
