SUMMARY = "LaTeX support for punk fonts"
DESCRIPTION = "The package and .fd file provide support for Knuth's punk \
fonts. That bundle also offers support within LaTeX; the \
present package is to be preferred."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn27389"

RPM_NAME = "texlive-punk-latex-2023.201.1.1svn27389-53.2.noarch.rpm"
RPM_HASH = "aa409d43cbf3fd4c26bd5466e04ea7a77f54f5d70264d8f6a7e0228919e297f2896ba7289fa5f01612947e43ecf3e1c6e3855ceb5f5326e72db989e8aa50cc0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ot1pnk.fd \
tex-punk.sty \
texlive-punk-latex"

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
