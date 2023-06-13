SUMMARY = "Parenthetic math expressions made simpler and less redundant"
DESCRIPTION = "This package provides a more condensed and flexible syntax for \
parenthesis-delimited expressions in math mode which also \
allows for an easier switching of brace sizes. For example, the \
syntax ' `\\big( a + b ) ' can be used to replace '\\bigl( a + b \
\\bigr)'."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn41859"

RPM_NAME = "texlive-phfparen-2023.201.1.0svn41859-51.1.noarch.rpm"
RPM_HASH = "50c8561e87269170c035910252ca669ed39cc95fab607cc7b7d41907cdfaa09d8c35606aa6a9ea88491fab64a6215e919f7459fb6f03a4de2da3918a91dd9f70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(phfparen.sty) \
texlive-phfparen"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(etoolbox.sty) \
tex(kvoptions.sty) \
tex(mathtools.sty) \
tex(xparse.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
