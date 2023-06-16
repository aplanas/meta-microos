SUMMARY = "Document class for the Cahiers du GERAD series"
DESCRIPTION = "This package provides the geradwp class, a class based on \
article and compatible with LaTeX. With this class, researchers \
at GERAD will be able to write their working paper while \
complying to all the presentation standards required by the \
Cahiers du GERAD series."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn63134"

RPM_NAME = "texlive-geradwp-2023.201.1.1svn63134-52.1.noarch.rpm"
RPM_HASH = "786f9821f15e8788d0ec3960af1614501225c44c9931d9f7b9af657aabf0b22007c7263d7ffe47e592549c6ceb4efcae55f069d5a28a70a1d9612d21bae639d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-geradwp.cls \
texlive-geradwp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-array.sty \
tex-article.cls \
tex-booktabs.sty \
tex-caption.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-latexsym.sty \
tex-mathrsfs.sty \
tex-multirow.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
