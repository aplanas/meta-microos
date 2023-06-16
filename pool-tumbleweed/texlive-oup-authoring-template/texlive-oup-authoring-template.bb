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

PV = "2023.201.1.1svn64491"

RPM_NAME = "texlive-oup-authoring-template-2023.201.1.1svn64491-54.1.noarch.rpm"
RPM_HASH = "eb9b1ebb265f882c319ad3513d89d9972632759c39649fbc1dc821d9f6643daa376ae1f39603084cc3cc6609eb9d7cb664eeddcfeec595f7fd8c7932ed3e75d5"
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
