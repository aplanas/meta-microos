SUMMARY = "LaTeX support for 'blackboard-style' cm fonts"
DESCRIPTION = "Provides LaTeX support for Blackboard variants of Computer \
Modern fonts. Declares a font family bbm so you can in \
principle write running text in blackboard bold, and lots of \
math alphabets for using the fonts within maths."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17224"

RPM_NAME = "texlive-bbm-macros-2023.201.svn17224-53.1.noarch.rpm"
RPM_HASH = "1c2d955352975ccb323664574892340e3662b6f43be37a6488d76cb1966cc464dd433dc7588b96cc98d3bfe37fe8c910e10cbd3963229f6cf7bd3f543ad58d95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bbm.sty \
tex-ubbm.fd \
tex-ubbmss.fd \
tex-ubbmtt.fd \
texlive-bbm-macros"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
