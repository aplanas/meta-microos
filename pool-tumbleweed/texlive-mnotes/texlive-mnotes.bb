SUMMARY = "Margin annotation for collaborative writing"
DESCRIPTION = "The package provides a flexible mechanism for annotating, and \
commenting upon, collaboratively-written documents."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9svn63406"

RPM_NAME = "texlive-mnotes-2023.209.0.0.9svn63406-55.1.noarch.rpm"
RPM_HASH = "a1c504d3842728246457fb2c2d095c2cdd29f923472f530881e649018de5d803196060f022e9642ad3b7785221824c74e4c9f9f2b131176d78af5f5c221c5b45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mnotes.sty \
texlive-mnotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-ifoddpage.sty \
tex-kvoptions.sty \
tex-marginnote.sty \
tex-sidenotes.sty \
tex-soul.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
