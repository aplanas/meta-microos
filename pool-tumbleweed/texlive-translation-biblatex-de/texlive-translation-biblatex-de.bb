SUMMARY = "German translation of the User Guide for BibLaTeX"
DESCRIPTION = "A German translation of the User Guide for BibLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.15bsvn59382"

RPM_NAME = "texlive-translation-biblatex-de-2023.209.3.15bsvn59382-53.1.noarch.rpm"
RPM_HASH = "4d38c3f4375251e465be7a3a575ef897bd33fa62769293b414d9eb676652a9fed3f427d23eed5041d65a8b13d83ef4e77cbc69c5b57f0964463a16281185d622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-biblatex-de"

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
