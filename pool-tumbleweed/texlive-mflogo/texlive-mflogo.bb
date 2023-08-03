SUMMARY = "LaTeX support for Metafont logo fonts"
DESCRIPTION = "LaTeX package and font definition file to access the Knuthian \
mflogo fonts described in 'The Metafontbook' and to typeset \
Metafont logos in LaTeX documents."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn42428"

RPM_NAME = "texlive-mflogo-2023.209.2.0svn42428-55.1.noarch.rpm"
RPM_HASH = "f2f1358dc7f8e6db957a82de5cba149fb94dfdbe92df99fd4512e4fb661aa5b9807b962ef17d7f00f5265d3303858dc6dd0649b271d35fab83f0f8881f4b30e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-logosl8.tfm \
tex-mflogo.sty \
tex-ulogo.fd \
texlive-mflogo"

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
