SUMMARY = "Create Karnaugh maps with LaTeX"
DESCRIPTION = "This LaTeX package allows the creation of (even large) Karnaugh \
maps. It provides a tabular-like input syntax and support for \
drawing bundles (implicants) around adjacent values. It is \
based on an answer at StackExchange."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.5svn56361"

RPM_NAME = "texlive-kvmap-2023.201.0.0.3.5svn56361-55.1.noarch.rpm"
RPM_HASH = "8913cf785f2cfda2082eb3e6e0be776abf5bf4338c9b98ef30f010ee0364ec58543d3109c4e87c569109093e8b331259d84f3dd29935dc9ef88b80b06cf28aaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kvmap.sty \
texlive-kvmap"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-expl3.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-amsmath \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3experimental \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
