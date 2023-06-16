SUMMARY = "Spot colours support for XeLaTeX"
DESCRIPTION = "The package provides macros for using spot colours in LaTeX \
documents. The package is a reimplementation of the spotcolor \
package for use with XeLaTeX. As such, it has the same user \
interface and the same capabilities."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn58212"

RPM_NAME = "texlive-xespotcolor-2023.201.2.1svn58212-52.1.noarch.rpm"
RPM_HASH = "6d81f10e6e73b796f3aab9ed9a2673b86b3b029cdf8362cb995e3a26b42d7c08710f26eb6c0738fe7dffd14e3bcbca9ecfe1dea5949f9792c31e7ca55271b225"
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
