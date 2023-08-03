SUMMARY = "Copy and paste into and across documents"
DESCRIPTION = "The clipboard package provides a basic framework for copying \
and pasting text and commands into and across multiple \
documents. It replaces the copypaste package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn47747"

RPM_NAME = "texlive-clipboard-2023.209.0.0.3svn47747-54.1.noarch.rpm"
RPM_HASH = "6fec2c5e65e2251f9e37545a2563a0b2ec831a9a8a432612729611a3a083b1f15fc4954a03999922aa8ce28e54682fbcb41f736e427f85e6cd997071c14dea5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clipboard.sty \
texlive-clipboard"

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
