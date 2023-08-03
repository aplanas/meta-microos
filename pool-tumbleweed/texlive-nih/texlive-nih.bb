SUMMARY = "A class for NIH grant applications"
DESCRIPTION = "The nih class offers support for grant applications to NIH, the \
National Institutes of Health, a US government agency. The \
example-* files provide a template for using nih.cls and \
submitting the biographical sketches the NIH wants. They \
(potentially) use denselists package, which just reduces list \
spacing; the package is distributed with the class, but is not \
part of the class proper. (The examples may be distributed \
without even the restrictions of the LaTeX licence.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-nih-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "17c2c44ffa621c23e21cc1dc2e2bb461854ab05b3e314afdc5c5a3c2bb4d01e9187b017c9e831ac96beda9f2f0b8126d223b98c683760c97d5af89c3eebafbf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-denselists.sty \
tex-nih.cls \
texlive-nih"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-helvet.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
