SUMMARY = "TikZ provides graphical layers on TikZ: 'behind', 'above' and 'glass'"
DESCRIPTION = "TikZ-layers is a tiny package that provides, along side \
'background', typical graphical layers on TikZ: 'behind', \
'above' and 'glass'. The layers may be selected with one of the \
styles 'on behind layer', 'on above layer', 'on glass layer' as \
an option to a {scope} environment."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9svn46660"

RPM_NAME = "texlive-tikz-layers-2023.209.0.0.9svn46660-53.1.noarch.rpm"
RPM_HASH = "72f1e3066abb928bb99c7eea0d984733cd73bef66a342abe0160bdf45d51f8200019dc6f7bc2d508078cc34ab27ff77512415d8d82c4ecdd018c37f3a397282a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-layers.sty \
texlive-tikz-layers"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
