SUMMARY = "Extended Greek and sans-serif math"
DESCRIPTION = "The hep-math-font package adjust the math fonts to be \
sans-serif if the document is sans-serif. Additionally Greek \
letters are redefined to be always italic and upright in math \
and text mode respectively. Some math font macros are adjusted \
to give more consistently the naively expected results. The \
package is loaded with \\usepackage{hep-math-font}."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64901"

RPM_NAME = "texlive-hep-math-font-2023.209.1.1svn64901-54.2.noarch.rpm"
RPM_HASH = "7bcf6cf0ed9fb02f947c1b091c1e418470adc0f5ea25c54aa0434003ae1b45d063f61cdc312ea7d461f5ba4e99752c2dfea3973e48e7c079fac1afa46aa6e9f5"
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
