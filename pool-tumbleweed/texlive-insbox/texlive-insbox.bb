SUMMARY = "Insert pictures/boxes into paragraphs"
DESCRIPTION = "The package provides convenient bundling of the \\parshape \
primitive. LaTeX users should note that this is a generic \
package, and should be loaded using \\input ."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.2svn34299"

RPM_NAME = "texlive-insbox-2023.209.2.2svn34299-54.1.noarch.rpm"
RPM_HASH = "18c4002fce1b3ec21538b116fba6bf6e57eb5bc401d7344f23e75caf4744d5f192074876c94ad74563531756a289f8090c1d6ba3305d099db93bc9eafb92b066"
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
