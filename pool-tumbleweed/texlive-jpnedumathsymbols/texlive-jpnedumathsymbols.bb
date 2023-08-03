SUMMARY = "Mathematical equation representation in Japanese education"
DESCRIPTION = "Mathematical equation representation in Japanese education \
differs somewhat from the standard LaTeX writing style. This \
package introduces mathematical equation representation in \
Japanese education."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn63864"

RPM_NAME = "texlive-jpnedumathsymbols-2023.209.1.1svn63864-56.1.noarch.rpm"
RPM_HASH = "fcc04d37ae12ecf0dea27aaae69e4a55398be2d204d0ad090d83b56b17c14c5547bb3877dbde419f7f68f9bbee6145389cf16dd35a2daea7fa48377bfa2edbc6"
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
