SUMMARY = "Presentations with Plain TeX"
DESCRIPTION = "The package offers a collection of simple macros for preparing \
presentations in Plain TeX. Slide colour and text colour may be \
set, links between parts of the presentation, to other files, \
and to web addresses may be inserted. Images may be included \
easily, and code is available to provide transition effects \
between slides or frames. The structure of the macros is not \
overly complex, so that users should find it easy to adapt the \
macros to their specific needs."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2.1svn50048"

RPM_NAME = "texlive-present-2023.201.2.2.1svn50048-52.1.noarch.rpm"
RPM_HASH = "9d8e591365f40d8b5f3c721bb70ec9c44ddd42f854d507f1a81d0f6f53a7c14788d9b05083ff46e87becf2326c055d8ed241dfa4f750b9bf64cafdb5eac84fa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(present.tex) \
texlive-present"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
