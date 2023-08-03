SUMMARY = "A LaTeX cheat sheet, in Brazilian Portuguese"
DESCRIPTION = "This is a translation to Brazilian Portuguese of Winston \
Chang's LaTeX cheat sheet"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.13svn15878"

RPM_NAME = "texlive-latexcheat-ptbr-2023.209.1.13svn15878-55.1.noarch.rpm"
RPM_HASH = "7cd0b6a43b88655544de3f29db0232d413ef606fbb1140d56dc0fe421226c4be5df41dbf5ef3c8fa5a7abe99279526e0cfc701627c846d89fa7abcd3896a7d55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexcheat-ptbr"

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
