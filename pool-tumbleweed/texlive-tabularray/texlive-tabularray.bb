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

PV = "2023.209.2023asvn66276"

RPM_NAME = "texlive-tabularray-2023.209.2023asvn66276-55.1.noarch.rpm"
RPM_HASH = "a9b923a762e7bc4575d9f68acb8131b76a0df23a72d299c9539d42d40e4623432eadbd9251996d8a1ecdddb7e4570ce883e03c34bfe61c34e1ea7acb17da9fc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabularray-2021.sty \
tex-tabularray.sty \
texlive-tabularray"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-booktabs.sty \
tex-diagbox.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-functional.sty \
tex-nameref.sty \
tex-ninecolors.sty \
tex-siunitx.sty \
tex-varwidth.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-zref-user.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
