SUMMARY = "Hyperref destination optimizer"
DESCRIPTION = "This package supports hyperref's pdfTeX driver. It removes \
unnecessary destinations and shortens the destination names or \
uses numbered destinations to get smaller PDF files."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn56253"

RPM_NAME = "texlive-hypdestopt-2023.201.2.7svn56253-52.1.noarch.rpm"
RPM_HASH = "e4cd9a50cd4a4c4d9408beabd66d0a7baf3d2523ff05555bd0f601dd555d2a406f6dd02b4e35b9e54dc5f1dbc1e108130e072c4e2ef6090c441349bc2bb99331"
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
