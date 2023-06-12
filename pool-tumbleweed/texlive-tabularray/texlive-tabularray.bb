SUMMARY = "Typeset tabulars and arrays with LaTeX3"
DESCRIPTION = "LaTeX tables are implemented using TeX commands such as \
\\halign, \\noalign, \\span, and \\omit. In order to implement new \
features, many macro packages have modified the inner table \
commands inside LaTeX. This makes package code complicated, \
difficult to maintain, and often conflicts with each other. At \
present, the LaTeX3 programming layer is basically mature. This \
tabularray package will discard the old \\halign commands and \
directly use LaTeX3 functions to parse the table, and then \
typeset the entire table. Under the premise of being compatible \
with the basic syntax of LaTeX2 tables, this macro package will \
completely separate the content and style of the table, and the \
style of the table can be completely set in keyval way."
LICENSE = "LPPL-1.0"

PV = "2023.201.2023asvn66276"

RPM_NAME = "texlive-tabularray-2023.201.2023asvn66276-54.1.noarch.rpm"
RPM_HASH = "b174e3d1cf6aece85d5444263c8f6828bf1d0294588c1acaf0326324fa687c8451e60dfeabe3f60fc2a23efb37cedd9955e58168a8cf104e3ea83164b0568862"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tabularray-2021.sty) \
tex(tabularray.sty) \
texlive-tabularray"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(booktabs.sty) \
tex(diagbox.sty) \
tex(environ.sty) \
tex(etoolbox.sty) \
tex(expl3.sty) \
tex(functional.sty) \
tex(nameref.sty) \
tex(ninecolors.sty) \
tex(siunitx.sty) \
tex(varwidth.sty) \
tex(xcolor.sty) \
tex(xparse.sty) \
tex(zref-user.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
