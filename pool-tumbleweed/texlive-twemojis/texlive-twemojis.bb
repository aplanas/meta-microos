SUMMARY = "Use Twitter's open source emojis through LaTeX commands"
DESCRIPTION = "This package provides a simple wrapper which allows to use \
Twitter's open source emojis through LaTeX commands. This \
relies on images, so no fancy unicode-font stuff is needed and \
it should work on every installation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.1_twemoji_v14.0.1svn62930"

RPM_NAME = "texlive-twemojis-2023.209.1.3.1_twemoji_v14.0.1svn62930-53.1.noarch.rpm"
RPM_HASH = "8daf744f66053539d1532a707e496c59ce63aea5f13697ee403c52b87767152a67a54fbdc49388eb87a6f8a64aa7e1e4141c2e77d89aeaa8921a80a5e9d1eb69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-twemojis.sty \
texlive-twemojis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
