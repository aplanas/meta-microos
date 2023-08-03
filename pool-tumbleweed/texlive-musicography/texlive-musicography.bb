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

PV = "2023.209.svn66115"

RPM_NAME = "texlive-musicography-2023.209.svn66115-55.1.noarch.rpm"
RPM_HASH = "3a1bb35c86ebe683663438c297118daa866c69569e848512a748d44434f837f54b0157ac0d5da22c2a3223789f49934e0b047b10d80a5e68014f625e0f966e85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-musicography.sty \
texlive-musicography"

RDEPENDS:${PN} += "/usr/bin/sh \
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
