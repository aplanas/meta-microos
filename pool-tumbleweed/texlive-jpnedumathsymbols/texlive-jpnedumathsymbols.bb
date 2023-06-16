SUMMARY = "Mathematical equation representation in Japanese education"
DESCRIPTION = "Mathematical equation representation in Japanese education \
differs somewhat from the standard LaTeX writing style. This \
package introduces mathematical equation representation in \
Japanese education."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn63864"

RPM_NAME = "texlive-jpnedumathsymbols-2023.201.1.1svn63864-55.1.noarch.rpm"
RPM_HASH = "5461669ef626d3bfbf9dc6997ab78042a7f239a89c5a03a949477ad63bce7f125c4720e9975d40cb67ffbd7d2e9221537e8dc08af41a89078d8db51a182291ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jpnedumathsymbols.sty \
texlive-jpnedumathsymbols"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-empheq.sty \
tex-luatexja-otf.sty \
tex-otf.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
