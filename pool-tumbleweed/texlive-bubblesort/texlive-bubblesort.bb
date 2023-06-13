SUMMARY = "Bubble sorts a list"
DESCRIPTION = "This package sorts a list of TeX items {item 1}...{item k} in \
'increasing' order where 'increasing' is determined by a \
comparator macro. By default it sorts real numbers with the \
usual meaning of 'increasing' but some other examples are \
discussed in the documentation. A second macro is included \
which sorts one list and applies the same permutation to a \
second list."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn56070"

RPM_NAME = "texlive-bubblesort-2023.201.1.0svn56070-52.1.noarch.rpm"
RPM_HASH = "0117353e55f4eed5f804f39d101950f56171656b67b5da99ac7d3ace5678f81227d0508198be21f766c1df45956f9c34b8182bccee66a6d72938ffdb78767bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bubblesort.sty) \
texlive-bubblesort"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
