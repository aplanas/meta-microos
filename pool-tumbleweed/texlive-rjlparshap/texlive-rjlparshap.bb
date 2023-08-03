SUMMARY = "Support for use of \\parshape in LaTeX"
DESCRIPTION = "The package provides macros and environments that relieve the \
programmer of some of the difficulties of using \\parshape in \
LaTeX macros. It does not actually calculate shapes in the way \
that the shapepar package does."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-rjlparshap-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "e9efbc5045ace466be7e82e218a146f4fffc66e751d9c00ee83bb65288bbbd9802bdc60eec047e4b6eb7bb34eac6db5a27305316b0384e911b2648e12087157e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rjlpshap.sty \
texlive-rjlparshap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-arrayjob.sty \
tex-forloop.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
