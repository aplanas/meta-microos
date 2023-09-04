SUMMARY = "Spot colours support for XeLaTeX"
DESCRIPTION = "The package provides macros for using spot colours in LaTeX \
documents. The package is a reimplementation of the spotcolor \
package for use with XeLaTeX. As such, it has the same user \
interface and the same capabilities."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn58212"

RPM_NAME = "texlive-xespotcolor-2023.209.2.1svn58212-53.2.noarch.rpm"
RPM_HASH = "8c2d6b50391f1ade8d750d3d2db37235d493c394fb6300a552b614a4815529e72a0a384ec2c08ce3da5af13c1953098b43d7aceb4a79f68b961b28cb723ad3bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xespotcolor.sty \
texlive-xespotcolor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-graphics.sty \
tex-iftex.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
