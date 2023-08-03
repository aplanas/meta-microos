SUMMARY = "Manage the options and loading order of other packages"
DESCRIPTION = "The package seeks to address the frustration caused by package \
conflicts. It is in an early stage of its development, and \
should probably not be used as a matter of course; however the \
author welcomes feedback via the home page link given in this \
catalogue entry. Nevertheless, the author urges users to try \
the package and to report issues (or whatever) via the \
package's repository. To use pkgloader you need, apart from \
packages installed by default, the lt3graph package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7.0svn47486"

RPM_NAME = "texlive-pkgloader-2023.209.0.0.7.0svn47486-52.1.noarch.rpm"
RPM_HASH = "b45b1ff34341853d1a4303617c97f2ceb28b3e2a8e8a6e0276d3e895c6735f616fd108b660de32baeff9e6383df8058ae68c186a21b37c58c22abf60de8b1e84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pkgloader-cls-pkg.sty \
tex-pkgloader-dry.sty \
tex-pkgloader-early.sty \
tex-pkgloader-error.sty \
tex-pkgloader-false.sty \
tex-pkgloader-late.sty \
tex-pkgloader-recommended.sty \
tex-pkgloader-true.sty \
tex-pkgloader.sty \
texlive-pkgloader"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-filecontents.sty \
tex-l3keys2e.sty \
tex-lt3graph.sty \
tex-withargs.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
