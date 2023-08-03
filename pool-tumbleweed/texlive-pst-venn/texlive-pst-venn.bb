SUMMARY = "A PSTricks package for drawing Venn sets"
DESCRIPTION = "This is a PSTricks related package for drawing Venn diagrams \
with three circles."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn49316"

RPM_NAME = "texlive-pst-venn-2023.209.0.0.01svn49316-54.1.noarch.rpm"
RPM_HASH = "bed6a4fb2795ac492a9d7f166364c17817db5bba7035c83837f92d5b61b34dbe76973a9481d890282accafc7ecc36fab137c041318d7bf7784e522559f45c82e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-venn.sty \
texlive-pst-venn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
