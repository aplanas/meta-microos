SUMMARY = "Dealing with some spacing issues"
DESCRIPTION = "This package provides macros for dealing with some spacing \
issues, e.g. centering a single line, making a variable strut, \
indenting a block, typesetting a compact list, placing two \
boxes side by side with vertical adjustment."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn66393"

RPM_NAME = "texlive-spacingtricks-2023.201.1.6svn66393-57.1.noarch.rpm"
RPM_HASH = "8b8f4e51c17664dda54c14de42062b8c6a124895fbada539deabae63c1a2181359cd6d66e92c0d2310bc0fdabee70a68723090d97b9ac29a14084e30613e5667"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(spacingtricks.sty) \
texlive-spacingtricks"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(centeredline.sty) \
tex(ifthen.sty) \
tex(pifont.sty) \
tex(setspace.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
