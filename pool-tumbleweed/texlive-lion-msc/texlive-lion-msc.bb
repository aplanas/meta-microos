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

PV = "2023.201.0.0.30svn55415"

RPM_NAME = "texlive-lion-msc-2023.201.0.0.30svn55415-54.1.noarch.rpm"
RPM_HASH = "f1e0ec585eb5e6eaaecfae78e27c97e788a9a99353f164cb6e60d07b411fb56084ee03ae48fcd3fa05d2e038f4550dc06e8463e24aa5d1a05724f7f9a489ad78"
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
