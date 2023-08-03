SUMMARY = "Tabbing with accented letters"
DESCRIPTION = "By default, some of the tabbing environment's commands clash \
with default accent commands; LaTeX provides the odd commands \
\\a', etc., to deal with the clash. The package offers a variant \
of the tabbing environment which does not create this \
difficulty, so that users need not learn two sets of accent \
commands."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn59715"

RPM_NAME = "texlive-tabbing-2023.209.svn59715-58.1.noarch.rpm"
RPM_HASH = "edcb0857befe3b645b5f6c72d88281d5a3b973c5a841d0647d7881ab7a64ec72c30997015901e865e0441198428b130477b90e57b31bb6240038c49b2758507f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Tabbing.sty \
texlive-tabbing"

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
