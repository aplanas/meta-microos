SUMMARY = "Extended Greek and sans-serif math"
DESCRIPTION = "The hep-math-font package adjust the math fonts to be \
sans-serif if the document is sans-serif. Additionally Greek \
letters are redefined to be always italic and upright in math \
and text mode respectively. Some math font macros are adjusted \
to give more consistently the naively expected results. The \
package is loaded with \\usepackage{hep-math-font}."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64901"

RPM_NAME = "texlive-hep-math-font-2023.209.1.1svn64901-54.1.noarch.rpm"
RPM_HASH = "392f99b0f50339084598b6b4f83aa4ea0b7e97017103a84a8087a9d1bb74907ad9ff08bc60bce073bec4205701e2227c6e243b7b91d77229bd87608199eea1e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-math-font.sty \
texlive-hep-math-font"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-MnSymbol.sty \
tex-amssymb.sty \
tex-amstext.sty \
tex-bm.sty \
tex-exscale.sty \
tex-fixmath.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-kvoptions.sty \
tex-pdftexcmds.sty \
tex-substitutefont.sty \
tex-textalpha.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
