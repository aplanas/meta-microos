SUMMARY = "Generate sentences from economic articles"
DESCRIPTION = "This package is a blind text generator that ouputs sentences \
inferred from abstracts of economic articles. All the \
paragraphs are taken with permission from \
https://ipsum.mwt.me/."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8.2svn58390"

RPM_NAME = "texlive-econlipsum-2023.201.0.0.8.2svn58390-53.1.noarch.rpm"
RPM_HASH = "5b0c99c691275b54a6d95c67b069299d6969a501b612f4e0705a4a2fc9b22227d7f336250b5f23c9a34654dabc80bae93717a40d4c1334928e93e6d53f33bab8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(econlipsum.sty) \
texlive-econlipsum"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
