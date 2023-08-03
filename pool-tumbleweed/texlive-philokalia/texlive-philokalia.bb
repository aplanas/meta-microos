SUMMARY = "A font to typeset the Philokalia Books"
DESCRIPTION = "The philokalia package has been designed to ease the use of the \
Philokalia-Regular OpenType font with XeLaTeX. The font started \
as a project to digitize the typeface used to typeset the \
Philokalia books."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn45356"

RPM_NAME = "texlive-philokalia-2023.209.1.2svn45356-52.1.noarch.rpm"
RPM_HASH = "a0bbbfcccbc89c364ea010c59e3d4edc7ec3a01be4de669d9cf6a09d167b531b2c84352e41f362fdb2482614a34c95bf43c535496c3c25f8753cb512e63d9579"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-philokalia.sty \
tex-tuplk.fd \
texlive-philokalia"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-lettrine.sty \
tex-xltxtra.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-philokalia-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
