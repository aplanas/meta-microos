SUMMARY = "Extend math family up to 256 for pLaTeX/upLaTeX/Lamed"
DESCRIPTION = "This package increases the upper limit of math symbols up to \
256, using \\omath... primitives. These primitives were \
originally introduced in Omega and are currently available in \
the following formats: pLaTeX (runs on e-pTeX), upLaTeX (runs \
on e-upTeX), Lamed (runs on Aleph, successor of Omega)."
LICENSE = "BSD-3-Clause"

PV = "2023.208.0.0.5svn53519"

RPM_NAME = "texlive-mathfam256-2023.208.0.0.5svn53519-53.1.noarch.rpm"
RPM_HASH = "ffb2fcf4f00ec336311ea0542337c5c84c2634d64768247af74b2d85dd6832ca23c5a61dae4a8514a6b162e63178f075f5b969972b637cf106b23b65df53c21b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathfam256.sty \
texlive-mathfam256"

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
