SUMMARY = "A general template for journals published by Oxford University Press (OUP)"
DESCRIPTION = "This package provides a general LaTeX template for journals \
published by Oxford University Press (OUP). The template \
outputs to the three official page designs (traditional, \
contemporary, modern) used by many journals published by OUP, \
with large, medium and small page options. For more information \
see \
https://academic.oup.com/journals/pages/authors/preparing_your_ \
manuscript."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64491"

RPM_NAME = "texlive-oup-authoring-template-2023.209.1.1svn64491-55.1.noarch.rpm"
RPM_HASH = "f83536b54c3933c812f0eccb427ee53479f9748292670dca8b4e32003225929b42c93cf9ad7f2c150c8a70515602924ecd4732d7a4e8f191f9d3b9c9e5c51721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-oup-authoring-template.cls \
texlive-oup-authoring-template"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithm.sty \
tex-algorithmicx.sty \
tex-algpseudocode.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-anyfontsize.sty \
tex-array.sty \
tex-caption.sty \
tex-chngpage.sty \
tex-color.sty \
tex-crop.sty \
tex-fix-cm.sty \
tex-flushend.sty \
tex-footnote.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-listings.sty \
tex-mathrsfs.sty \
tex-multirow.sty \
tex-natbib.sty \
tex-rotating.sty \
tex-stfloats.sty \
tex-subfloat.sty \
tex-tikz.sty \
tex-totcount.sty \
tex-url.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
