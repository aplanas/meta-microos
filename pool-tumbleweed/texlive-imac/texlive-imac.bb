SUMMARY = "International Modal Analysis Conference format"
DESCRIPTION = "A set of files for producing correctly formatted documents for \
the International Modal Analysis Conference. The bundle \
provides a LaTeX package and a BibTeX style file."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn17347"

RPM_NAME = "texlive-imac-2023.201.svn17347-52.1.noarch.rpm"
RPM_HASH = "b2f0c8416f63d1107dfa19a4cd5ff2cb768f9f5696131477549ca6208f95cf08753e61f0ecde65ddb58ef80a79ebee58d7e0acb1554383b687d46614684e2d5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(imac.sty) \
texlive-imac"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(cite.sty) \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
