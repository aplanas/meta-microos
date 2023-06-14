SUMMARY = "Formulas frequently used in rigid body mechanics"
DESCRIPTION = "This package provides a number of formulas frequently used in \
rigid body mechanics. Since most of these formulas are long and \
tedious to write, this package wraps them up in short commands."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn60346"

RPM_NAME = "texlive-mecaso-2023.201.1.0svn60346-52.1.noarch.rpm"
RPM_HASH = "3d58fe786b29f6f4fdc2f817f922fba22ff65e76e47ade873f9771a53ff580e5f6370f27d182493750d29088c32cdb87157fb7e8f119a9ba5deb40699b55fd55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mecaso.sty \
texlive-mecaso"

RDEPENDS:${PN} += "/bin/sh \
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
