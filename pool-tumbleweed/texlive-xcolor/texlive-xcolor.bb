SUMMARY = "Driver-independent color extensions for LaTeX and pdfLaTeX"
DESCRIPTION = "The package starts from the basic facilities of the color \
package, and provides easy driver-independent access to several \
kinds of color tints, shades, tones, and mixes of arbitrary \
colors. It allows a user to select a document-wide target color \
model and offers complete tools for conversion between eight \
color models. Additionally, there is a command for alternating \
row colors plus repeated non-aligned material (like horizontal \
lines) in tables. Colors can be mixed like \
\\color{red!30!green!40!blue}."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.14svn63563"

RPM_NAME = "texlive-xcolor-2023.209.2.14svn63563-53.2.noarch.rpm"
RPM_HASH = "d15fb105dce6be11aec69e7a337865c3585f88770e1847979e1b56ddb971e57666f64fee4eb145f7e7b1c5382067ecf996c8ed34b3fa02595d97a6eaeabdda38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-svgnam.def \
tex-x11nam.def \
tex-xcolor.sty \
texlive-xcolor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-colortbl.sty \
tex-pdfcolmk.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
