SUMMARY = "Create a frontispiece for Italian theses"
DESCRIPTION = "Typesetting a frontispiece independently of the layout of the \
main document is difficult. This package provides a solution by \
producing an auxiliary TeX file to be typeset on its own and \
the result is automatically included at the next run. The \
markup necessary for the frontispiece is written in the main \
document in a frontespizio environment. Documentation is mainly \
in Italian, as the style is probably apt only to theses in \
Italy."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4asvn24054"

RPM_NAME = "texlive-frontespizio-2023.201.1.4asvn24054-52.1.noarch.rpm"
RPM_HASH = "38cdb20daec98eed7a8621a96a61431d4eeb424547b6f25d8f104ec0694095d8e95131a662d3341081232dd1a43f130dfda663f0d5852fea22151a0a3910fc9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-frontespizio.sty \
texlive-frontespizio"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-atbegshi.sty \
tex-environ.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
