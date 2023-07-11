SUMMARY = "Commands for MatematicaC3 textbooks"
DESCRIPTION = "The package provides support for the Matematica C3 project to \
produce free mathematical text books for use in Italian high \
schools."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0.1svn29845"

RPM_NAME = "texlive-matc3-2023.208.1.0.1svn29845-53.1.noarch.rpm"
RPM_HASH = "3127e307a6a27d92995efc803bfd4362fa1a108cd36f15714decb5b11c9684b018f8a30e8d89da4ec740cc64be066c9611457f78a38ff0f22a6e6e4db0df8016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-matc3.sty \
texlive-matc3"

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
