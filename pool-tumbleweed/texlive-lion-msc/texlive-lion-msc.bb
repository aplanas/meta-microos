SUMMARY = "LaTeX class for B.Sc. and M.Sc. reports at Leiden Institute of Physics (LION)"
DESCRIPTION = "LaTeX class for B.Sc. and M.Sc. reports at Leiden Institute of \
Physics (LION). The purpose of this class is twofold: It \
creates a uniform layout of the student theses from our \
department. More importantly it contains several fields on the \
front-page that the user needs to fill that are used in the \
university administration (name, student number and name of \
supervisor). Students are free to change the layout of the text \
but should leave the title page as it is."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.30svn55415"

RPM_NAME = "texlive-lion-msc-2023.209.0.0.30svn55415-55.1.noarch.rpm"
RPM_HASH = "e773d8b7cbc278efed5e7d4ec2e698ba29bc56c64b895ee05ad7ba228db98528ba612da1bbb2eab5c4757ad86c1ff6ce0280a6c80deac39b91508418deed4136"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lion-msc.cls \
texlive-lion-msc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-babel.sty \
tex-calc.sty \
tex-caption.sty \
tex-datetime.sty \
tex-fancyhdr.sty \
tex-fncychap.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-mathpazo.sty \
tex-natbib.sty \
tex-report.cls \
tex-titling.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
