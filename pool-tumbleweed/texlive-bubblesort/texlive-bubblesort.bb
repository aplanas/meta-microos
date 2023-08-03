SUMMARY = "Bubble sorts a list"
DESCRIPTION = "This package sorts a list of TeX items {item 1}...{item k} in \
'increasing' order where 'increasing' is determined by a \
comparator macro. By default it sorts real numbers with the \
usual meaning of 'increasing' but some other examples are \
discussed in the documentation. A second macro is included \
which sorts one list and applies the same permutation to a \
second list."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn56070"

RPM_NAME = "texlive-bubblesort-2023.209.1.0svn56070-53.1.noarch.rpm"
RPM_HASH = "7d2f2c683679b375a8ed528848564eef5676aedc946c2ce95704bf50d263fdcc65ba21c55a799cfbd461e25a69434b51f4531b51de1b4a3df7fa1b425431a162"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bubblesort.sty \
texlive-bubblesort"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
