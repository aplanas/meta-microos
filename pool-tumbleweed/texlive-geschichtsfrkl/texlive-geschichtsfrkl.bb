SUMMARY = "BibLaTeX style for historians"
DESCRIPTION = "The package provides a BibLaTeX style, (mostly) meeting the \
requirements of the History Faculty of the University of \
Freiburg (Germany)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn42121"

RPM_NAME = "texlive-geschichtsfrkl-2023.209.1.4svn42121-53.1.noarch.rpm"
RPM_HASH = "19c4770f108dfa35e5c78d8e2050d51c0dbafc5da391fa4f2029c9d9c2b279490ac9118b726bd81e72a406379ebc924d852e8be3c139872bc3792462d65a163f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-geschichtsfrkl.bbx \
tex-geschichtsfrkl.cbx \
tex-geschichtsfrkldoc.sty \
texlive-geschichtsfrkl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-standard.bbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
