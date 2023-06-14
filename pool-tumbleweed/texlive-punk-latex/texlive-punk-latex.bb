SUMMARY = "LaTeX support for punk fonts"
DESCRIPTION = "The package and .fd file provide support for Knuth's punk \
fonts. That bundle also offers support within LaTeX; the \
present package is to be preferred."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn27389"

RPM_NAME = "texlive-punk-latex-2023.201.1.1svn27389-53.1.noarch.rpm"
RPM_HASH = "7efd72a63dbb5fddec63a9ddcb3a06fa1a0b2027cdc49d629681f5e331b09c3279051d4a4d5974078b2883bf4d9cc99385ddfefea0767865c4cf363ea60afc78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ot1pnk.fd \
tex-punk.sty \
texlive-punk-latex"

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
