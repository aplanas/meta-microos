SUMMARY = "Copy and paste into and across documents"
DESCRIPTION = "The clipboard package provides a basic framework for copying \
and pasting text and commands into and across multiple \
documents. It replaces the copypaste package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn47747"

RPM_NAME = "texlive-clipboard-2023.201.0.0.3svn47747-53.1.noarch.rpm"
RPM_HASH = "1f2e2d135527ce7ad0d42a590c92f5a1e91a5d26fa40bd446154ce240a1bab56d84d8582f4a552bf281fab96dafd19cd9192cce90e624e961ef4d0fd8f78d1ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clipboard.sty \
texlive-clipboard"

RDEPENDS:${PN} += "/bin/sh \
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
