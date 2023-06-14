SUMMARY = "Minipage spanning a complete page"
DESCRIPTION = "This package provides the environment fullminipage, which \
generates a minipage spanning a new, complete page with page \
style empty. The environment provides options to set margins \
around the minipage and configure the background."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.1.1svn34545"

RPM_NAME = "texlive-fullminipage-2023.201.0.0.1.1svn34545-52.1.noarch.rpm"
RPM_HASH = "28dd404896d789aae0d751ad1c6779434d8c4ac294e9694c866fca5bf97aafe58acca5a9febd207b1e38f63305d45c39d8dd6bb150a16ad499449ff861d4401d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fullminipage.sty \
texlive-fullminipage"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
