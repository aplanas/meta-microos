SUMMARY = "Typesetting academic documents from the University of Caxias do Sul"
DESCRIPTION = "This is a LaTeX class for typesetting academic documents \
according to the ABNT (Brazilian Technical Standards \
Association) standards and the UCS (University of Caxias do \
Sul) specifications."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.0svn52698"

RPM_NAME = "texlive-ucsmonograph-2023.209.1.3.0svn52698-54.1.noarch.rpm"
RPM_HASH = "fa4044d3184dee3cc6d31f2597ea1cf01d6b94db525bf60f544783b2cca106a6148d87aaeb6ff6e3422bccbf4df4cab9fcdaa02807334f5e0db681111e7898b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ucsmonograph.cls \
texlive-ucsmonograph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-abntex2.cls \
tex-adjustbox.sty \
tex-amsmath.sty \
tex-calc.sty \
tex-caption.sty \
tex-chngcntr.sty \
tex-cite.sty \
tex-etoolbox.sty \
tex-float.sty \
tex-geometry.sty \
tex-glossaries-extra.sty \
tex-graphicx.sty \
tex-icomma.sty \
tex-ifluatex.sty \
tex-ifthen.sty \
tex-indentfirst.sty \
tex-kvoptions.sty \
tex-lmodern.sty \
tex-suffix.sty \
tex-textpos.sty \
tex-unicode-math.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
