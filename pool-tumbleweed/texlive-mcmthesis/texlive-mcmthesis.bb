SUMMARY = "Template designed for MCM/ICM"
DESCRIPTION = "The package offers a template for MCM (The Mathematical Contest \
in Modeling) and ICM (The Interdisciplinary Contest in \
Modeling) for typesetting the submitted paper."
LICENSE = "LPPL-1.0"

PV = "2023.201.6.3.1svn57333"

RPM_NAME = "texlive-mcmthesis-2023.201.6.3.1svn57333-52.1.noarch.rpm"
RPM_HASH = "47d8482698125c08d0cef633f393ae0f2ecd1a7c567be404fef042686f3567d9e9729ac9db364918c4e4e5ae732bdfd3ef33331b44aac544d4f59507b7d693b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mcmthesis.cls \
texlive-mcmthesis"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-appendix.sty \
tex-array.sty \
tex-article.cls \
tex-berasans.sty \
tex-bm.sty \
tex-bmpsize.sty \
tex-booktabs.sty \
tex-calc.sty \
tex-colortbl.sty \
tex-environ.sty \
tex-epstopdf.sty \
tex-etoolbox.sty \
tex-fancybox.sty \
tex-fancyhdr.sty \
tex-flafter.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hhline.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-lastpage.sty \
tex-latexsym.sty \
tex-listings.sty \
tex-longtable.sty \
tex-mathrsfs.sty \
tex-multirow.sty \
tex-paralist.sty \
tex-pifont.sty \
tex-tabularx.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
