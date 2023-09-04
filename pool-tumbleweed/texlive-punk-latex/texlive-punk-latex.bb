SUMMARY = "LaTeX support for punk fonts"
DESCRIPTION = "The package and .fd file provide support for Knuth's punk \
fonts. That bundle also offers support within LaTeX; the \
present package is to be preferred."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn27389"

RPM_NAME = "texlive-punk-latex-2023.209.1.1svn27389-54.2.noarch.rpm"
RPM_HASH = "e4754a3b5c9e3ae55d13f0687c689975b8dfd3aa1c4dbcc1c01da2f82111c8523671cae4d16609f812590a3dc75faeb226b2f5e4b3953eb2d4cf4a636b8d718b"
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
