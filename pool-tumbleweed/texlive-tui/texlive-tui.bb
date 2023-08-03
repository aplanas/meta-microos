SUMMARY = "Thesis style for the University of the Andes, Colombia"
DESCRIPTION = "Doctoral Dissertations from the Faculty of Engineering at the \
Universidad de los Andes, Bogota, Colombia. The class is \
implemented as an extension of the memoir class. Clase de Tesis \
doctorales para ingenieria, Universidad de los Andes, Bogota."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9svn27253"

RPM_NAME = "texlive-tui-2023.209.1.9svn27253-53.1.noarch.rpm"
RPM_HASH = "5049750742cf58dc8311fecace0a545f14b61b15bf0510467b35d865bd0a37aa98c64ff81c2949e95bbc5f0160e1fb580b45dfa6d5c991d74749fb72a0ce1fb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tui.cls \
texlive-tui"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-MnSymbol.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-babel.sty \
tex-breakurl.sty \
tex-courier.sty \
tex-csquotes.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-kpfonts.sty \
tex-kvoptions.sty \
tex-makeidx.sty \
tex-mathptmx.sty \
tex-memoir.cls \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
