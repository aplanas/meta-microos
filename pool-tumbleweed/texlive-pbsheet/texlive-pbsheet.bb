SUMMARY = "Problem sheet class"
DESCRIPTION = "This class is designed to simplify the typesetting of problem \
sheets with Mathematics and Computer Science content. It is \
currently customised towards teaching in French (and the \
examples are in French)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn24830"

RPM_NAME = "texlive-pbsheet-2023.209.0.0.1svn24830-52.1.noarch.rpm"
RPM_HASH = "b962ae52e40d0e5e4264057dece3d4be665d0aa24629553ed66adf1eb37b8aa60f3fc31c08f51005c44f6ea82071467aa067ad2f73df191afab83b940002e222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pbsheet.cls \
texlive-pbsheet"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-aeguill.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-babel.sty \
tex-color.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-latexsym.sty \
tex-listings.sty \
tex-moreverb.sty \
tex-rotating.sty \
tex-url.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
