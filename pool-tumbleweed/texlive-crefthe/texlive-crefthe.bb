SUMMARY = "Cross referencing with proper definite articles"
DESCRIPTION = "By default, when using cleveref's \\cref to reference \
theorem-like environments, the names do not contain definite \
articles. In languages such as French, Italian, Portuguese, \
Spanish, etc. this results in incorrect grammar. For this \
purpose, the current package offers \\crefthe, which handles the \
definite articles properly (especially for the article \
contractions in many European languages)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64498"

RPM_NAME = "texlive-crefthe-2023.209.svn64498-55.1.noarch.rpm"
RPM_HASH = "0b044b832919a7bfced7613b16a4f8df77f30fdf1e9166b140b1b3fa9deed3e7ab6308339176c627955ce08d6ae8ec472513b11fcf94832d876419ae34c5ae19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-crefthe.sty \
texlive-crefthe"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cleveref.sty \
tex-regexpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
