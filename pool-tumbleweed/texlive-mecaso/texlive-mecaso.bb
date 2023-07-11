SUMMARY = "Formulas frequently used in rigid body mechanics"
DESCRIPTION = "This package provides a number of formulas frequently used in \
rigid body mechanics. Since most of these formulas are long and \
tedious to write, this package wraps them up in short commands."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.1.0svn60346"

RPM_NAME = "texlive-mecaso-2023.208.1.0svn60346-53.1.noarch.rpm"
RPM_HASH = "2499d837d247f7ad1b7ff494709f9da571a24d8529a2c68aeda8410d589a88d21151c5474735815a7116e0407c7a2992ff1a80333aac6f9b1fb96d6200409756"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mecaso.sty \
texlive-mecaso"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-mathrsfs.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
