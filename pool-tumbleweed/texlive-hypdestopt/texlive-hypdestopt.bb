SUMMARY = "Hyperref destination optimizer"
DESCRIPTION = "This package supports hyperref's pdfTeX driver. It removes \
unnecessary destinations and shortens the destination names or \
uses numbered destinations to get smaller PDF files."
LICENSE = "LPPL-1.0"

PV = "2023.208.2.7svn56253"

RPM_NAME = "texlive-hypdestopt-2023.208.2.7svn56253-53.1.noarch.rpm"
RPM_HASH = "56c0b7a4430ac636b1251638b085d325fd497a42584e173583a25e51a68fabfb55cd3ee72c28d98fcd1983c903bacbed3165fa925a110aad9fad3ef85ac2412a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hypdestopt.sty \
texlive-hypdestopt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphalph.sty \
tex-auxhook.sty \
tex-iftex.sty \
tex-pdfescape.sty \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
