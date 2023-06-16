SUMMARY = "Thesis style for the University of the Andes, Colombia"
DESCRIPTION = "Doctoral Dissertations from the Faculty of Engineering at the \
Universidad de los Andes, Bogota, Colombia. The class is \
implemented as an extension of the memoir class. Clase de Tesis \
doctorales para ingenieria, Universidad de los Andes, Bogota."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9svn27253"

RPM_NAME = "texlive-tui-2023.201.1.9svn27253-52.1.noarch.rpm"
RPM_HASH = "ef210ae22b291a3ea90fcf2532157384bd428d79d9bddaa660d566b301ec9815c5bf2ccf3952f9f0358b971f47ebd918607c66f6eb0aa973cad1b800dd90bd1c"
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
