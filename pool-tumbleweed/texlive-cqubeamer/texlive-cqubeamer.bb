SUMMARY = "LaTeX Beamer Template for Chongqing University"
DESCRIPTION = "This package provides a LaTeX beamer template designed for \
researchers of Chongqing University. It can be used for \
academic reports, conferences, or thesis defense, and can be \
helpful for delivering a speech. It should be used with the \
XeTeX engine."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn54512"

RPM_NAME = "texlive-cqubeamer-2023.209.1.0svn54512-55.1.noarch.rpm"
RPM_HASH = "6e3dacbd2cc19f4020946843fc4c6cf6952da55579d0e918369f112f54962a9c5f97686eb0aa5cb2457512cf96c84103c3c20ee8aa6d6b85efb57c3ecb00f429"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cqubeamer.sty \
texlive-cqubeamer"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bookmark.sty \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-perpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
