SUMMARY = "Dark color themes for beamer"
DESCRIPTION = "A package with three dark color themes for beamer, designed for \
presentations with pictures and/or for bright rooms without \
screen. These themes mix one dominant foreground colour and a \
black background. Cormorant stands for green, frigatebird for \
red and magpie for blue."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5.1svn55117"

RPM_NAME = "texlive-beamerdarkthemes-2023.209.0.0.5.1svn55117-54.1.noarch.rpm"
RPM_HASH = "2a2cf8b14e67837e37af7e09588d70e04beae996d6271d6fc16121c1784383a17701e68602c936606a3006763fc8f2bb11baaee36e048baafb0048479ff32c63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemecormorant.sty \
tex-beamercolorthemefrigatebird.sty \
tex-beamercolorthememagpie.sty \
texlive-beamerdarkthemes"

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
