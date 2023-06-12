SUMMARY = "Getting up and running with AMS-LaTeX"
DESCRIPTION = "The document aims to get you up and running with AMS-LaTeX as \
quickly as possible. These instructions (along with a template \
file template.tex) are not a substitute for the full \
documentation, but they may get you started quickly enough so \
that you will only need to refer to the main documentation \
occasionally. In addition to 'AMS-LaTeX out of the box', the \
document contains: a section describing how to draw commutative \
diagrams using Xy-pic; and a section describing how to use \
amsrefs to create a bibliography."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn28980"

RPM_NAME = "texlive-amslatex-primer-2023.201.2.3svn28980-54.1.noarch.rpm"
RPM_HASH = "65445f27c678363554820d2dbde593b4614dacec45c2e1993fdfcedf1647ba595834e29c3767e5a8b945e02b3604d43f15917f86573961f67d4739b9385492cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amslatex-primer"
RDEPENDS:${PN} += "/bin/sh \
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
