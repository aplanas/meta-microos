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

PV = "2023.201.0.0.7.0svn47486"

RPM_NAME = "texlive-pkgloader-2023.201.0.0.7.0svn47486-51.1.noarch.rpm"
RPM_HASH = "38a0341af7f690c1184785b12d9c23a31ac369cab4f467643279a4547803c57392ebf6c87c0f4853dc64d724c6b4ed899a2ba68517270c9a1dca7c06a8d5bea0"
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

RDEPENDS:${PN} += "/bin/sh \
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
