SUMMARY = "Accessing symbols for music writing with pdfLaTeX"
DESCRIPTION = "This package makes available the most commonly used symbols in \
writing about music in a way that can be used with pdfLaTeX and \
looks consistent and attractive. It includes accidentals, \
meters, and notes of different rhythmic values. The package \
builds on the approach used in the harmony package, where the \
symbols are taken from the MusiXTeX fonts. But it provides a \
larger range of symbols and a more flexible, user-friendly \
interface written using xparse and stackengine."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66115"

RPM_NAME = "texlive-musicography-2023.201.svn66115-54.1.noarch.rpm"
RPM_HASH = "4bb23280c4dccf3463fd4583caa4f45fbf1145af864a6d16d1592714ac88cdc2e57c49acf54f396983177ebc98ba14b1a8ea83f7ccf914453fa0f865b6e34a26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-musicography.sty \
texlive-musicography"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-stackengine.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
