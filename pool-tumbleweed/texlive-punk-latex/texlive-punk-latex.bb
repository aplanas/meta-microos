SUMMARY = "LaTeX support for punk fonts"
DESCRIPTION = "The package and .fd file provide support for Knuth's punk \
fonts. That bundle also offers support within LaTeX; the \
present package is to be preferred."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn27389"

RPM_NAME = "texlive-punk-latex-2023.209.1.1svn27389-54.1.noarch.rpm"
RPM_HASH = "8aec4217fe03f6915a68c3a1b6b584cbe01cf2e4c5735f88e74ed5e393f08e6e15b51ca8a5de90d4836ce949749d3ea93d27ac6d0d62dc1f366e92dc665561b6"
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
