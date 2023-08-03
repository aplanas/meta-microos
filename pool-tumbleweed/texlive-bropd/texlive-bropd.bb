SUMMARY = "Simplified brackets and differentials in LaTeX"
DESCRIPTION = "The package simplifies the process of writing differential \
operators and brackets in LaTeX. The commands facilitate the \
easy manipulation of equations involving brackets and allow \
partial differentials to be expressed in an alternate form."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn35383"

RPM_NAME = "texlive-bropd-2023.209.1.2svn35383-53.1.noarch.rpm"
RPM_HASH = "2459d61f3653239442cea9542153bde9e147949b52f4f7d92e6409ef9e17b26e6fc145674f75b07113cea4fe8d2835e1d4b7a5c15cab51a1dbf0a241d128e9e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bropd.sty \
texlive-bropd"

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
