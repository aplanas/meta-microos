SUMMARY = "Using the Pygments highlighter in LaTeX"
DESCRIPTION = "A package which allows to use the Pygments highlighter inside \
LaTeX documents. Pygments supports syntax colouring of over 50 \
types of files, and ships with multiple colour schemes."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.0svn15878"

RPM_NAME = "texlive-texments-2023.201.0.0.2.0svn15878-54.1.noarch.rpm"
RPM_HASH = "baffe34385d51665112ba5e9e4c5aeef86d66a30487091f8fe9a7bc23233f32fb523a0135cdd7d5e50c9c1dbb128bc13a25080990b598056958ac56e98448770"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texments.sty \
texlive-texments"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-fancyvrb.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
