SUMMARY = "Hyperref destination optimizer"
DESCRIPTION = "This package supports hyperref's pdfTeX driver. It removes \
unnecessary destinations and shortens the destination names or \
uses numbered destinations to get smaller PDF files."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn56253"

RPM_NAME = "texlive-hypdestopt-2023.209.2.7svn56253-54.1.noarch.rpm"
RPM_HASH = "c3da0b7e71a95db24f814e9c300e4c61ea20bb04bea234497f56b6f0a952f5e81be79ee98427d5d9a7b86e6464a102ca120a24cf76bc2339ec0154a62e74c812"
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
