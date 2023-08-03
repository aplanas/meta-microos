SUMMARY = "Draw MSC diagrams"
DESCRIPTION = "The package should be useful to all people that prepare their \
texts with LaTeX and want to draw Message Sequence Charts in \
their texts. The package is not an MSC editor; it simply takes \
a textual description of an MSC and draws the corresponding \
MSC. The current version of the MSC macro package supports the \
full MSC2000 language."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.00svn63291"

RPM_NAME = "texlive-msc-2023.209.2.00svn63291-55.1.noarch.rpm"
RPM_HASH = "6c10272129e4385f913aaea5d9ab35bc712d274f441f634c52df2710a371dc89108828bd9b5b3ef3612fc1ee5054962d0260a6b09aee4254df511064b8c8a853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-msc.sty \
texlive-msc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
