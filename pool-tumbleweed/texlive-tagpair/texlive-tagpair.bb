SUMMARY = "Word-by-word glosses, translations, and bibliographic attributions"
DESCRIPTION = "This package provides environments and commands for pairing \
lines, bottom lines, and tagged lines, intended to be used in \
particular for word-by-word glosses, translations, and \
bibliographic attributions, respectively. This LaTeX package is \
inspired by Marcel R. van der Goot's classic Plain TeX macros \
in gloss.tex."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn42138"

RPM_NAME = "texlive-tagpair-2023.209.1.1svn42138-55.1.noarch.rpm"
RPM_HASH = "5674a61149e9135afa174ea716785eca64919cadd75da4233409fab4f14d1dd0042b271ced0928de4bb8878f4d65bd5792023c3fbb8de4b79c45807ab3524520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tagpair.sty \
texlive-tagpair"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-varwidth.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
