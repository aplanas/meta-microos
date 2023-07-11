SUMMARY = "Insert pictures/boxes into paragraphs"
DESCRIPTION = "The package provides convenient bundling of the \\parshape \
primitive. LaTeX users should note that this is a generic \
package, and should be loaded using \\input ."
LICENSE = "SUSE-Public-Domain"

PV = "2023.208.2.2svn34299"

RPM_NAME = "texlive-insbox-2023.208.2.2svn34299-53.1.noarch.rpm"
RPM_HASH = "bc6c08e5660918585084cdbd6d5568a6b6f3715ad9acc426867fac28c147e085c2af75378dc262761d2398e3c066c93ab5b6c0411497c0786b5d50c55256c125"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-insbox.tex \
texlive-insbox"

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
