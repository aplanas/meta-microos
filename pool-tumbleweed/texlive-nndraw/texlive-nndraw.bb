SUMMARY = "Draw neural networks"
DESCRIPTION = "With this package you can create fully connected neural \
networks in a simple and efficient way."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn59674"

RPM_NAME = "texlive-nndraw-2023.209.1.0svn59674-55.1.noarch.rpm"
RPM_HASH = "837139f74771e915dd2dd823bf47b32e83eb13b6aab41e52aceb796c4b9b560b76f6868b9f8486d1c30b16c8a6e47554f3ed4a69fa23d5f5f6909db54a6e0b7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nndraw.sty \
texlive-nndraw"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
