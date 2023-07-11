SUMMARY = "List operations for LaTeX2e"
DESCRIPTION = "This package provides a list data structure and common list \
functions such as \\macrolistadd, \\macrolistremove, \
\\macrolistforeach, as well as \\macrolistremovelast (similar to \
C++'s pop_back) and \\macrolistjoin (similar to Javascript's \
arr.join). Unlike most programming languages, the lists in this \
package are 1-indexed, meaning the first element is numbered 1, \
the second element numbered 2, and so on."
LICENSE = "LPPL-1.0"

PV = "2023.208.2.1.0svn60139"

RPM_NAME = "texlive-macrolist-2023.208.2.1.0svn60139-53.1.noarch.rpm"
RPM_HASH = "b01654cecf466339a4fce937a993e5dfcc8943d26d47767f05813c2640acf7945f41288fc1363641406e7bfbe5be3f2c411f3d7bb678300606d7c5c01f61f15c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-macrolist.sty \
texlive-macrolist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgffor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
