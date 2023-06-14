SUMMARY = "Fix alignment at \\overset or \\underset"
DESCRIPTION = "This package allows the base character of \\underset or \\overset \
to be used as the alignment position for the amsmath aligned \
math environments."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.0svn47290"

RPM_NAME = "texlive-aligned-overset-2023.201.0.0.1.0svn47290-54.1.noarch.rpm"
RPM_HASH = "ea882b6173d1cc3c4622f9a2fb494950d67b4154b33ded593ef4126402f64a89438c340ce2d63abd4641dd68adad2c80e119600cb7f343815a532665e0695720"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aligned-overset.sty \
texlive-aligned-overset"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-expl3.sty \
tex-mathtools.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
