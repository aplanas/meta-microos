SUMMARY = "Spot colours support for XeLaTeX"
DESCRIPTION = "The package provides macros for using spot colours in LaTeX \
documents. The package is a reimplementation of the spotcolor \
package for use with XeLaTeX. As such, it has the same user \
interface and the same capabilities."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn58212"

RPM_NAME = "texlive-xespotcolor-2023.201.2.1svn58212-52.2.noarch.rpm"
RPM_HASH = "c3cea731db124597b7eef9ed6c1d5c21c731718df4cca10a1fe2390891e7d65cc7853339dfa60bcc5cbe122ff453056e5b4ad35257ac2be3bfa38afe57856b60"
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
