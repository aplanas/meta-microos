SUMMARY = "Small macro to help building nice and complex layout materials"
DESCRIPTION = "The package provides a small macro to help building nice and \
complex layout materials."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn42039"

RPM_NAME = "texlive-tikz-page-2023.209.1.0svn42039-53.1.noarch.rpm"
RPM_HASH = "4c850fd70eb1578d4b4a4a0c99b661021575d199cc0a0e6043d95a4b1b748038f2e8fbb300ced6bafac2ed0e65ac3d62d9929d22c6ed472ce92a11eddf03f0ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-page.sty \
texlive-tikz-page"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-textpos.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
