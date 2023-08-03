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

RPM_NAME = "texlive-xcolor-2023.209.2.14svn63563-53.1.noarch.rpm"
RPM_HASH = "d33db7f000c1be78ed183852715a325d4313063d9cfda4820e072bb8041660a0119c47db875dfdfe0cb0a2f9823f630e32c5c7d5d2df4e1a3b5fd617ba7c7bb4"
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
