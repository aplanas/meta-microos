SUMMARY = "PSTricks support functions"
DESCRIPTION = "The package provides helper functions for other PSTricks \
related packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.12svn60621"

RPM_NAME = "texlive-pst-tools-2023.209.0.0.12svn60621-54.2.noarch.rpm"
RPM_HASH = "bd46085693b32b618e5e17b5730285540a513344c540a1b91d80395fba56b6651ca834dd0bb2411b22b4fccd694d81554e9668b51666bba9a18ec1fd87784a92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-tools.sty \
tex-pst-tools.tex \
texlive-pst-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
