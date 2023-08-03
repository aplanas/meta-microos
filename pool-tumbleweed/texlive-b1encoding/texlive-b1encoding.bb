SUMMARY = "LaTeX encoding tools for Bookhands fonts"
DESCRIPTION = "The package characterises and defines the author's B1 encoding \
for use with LaTeX when typesetting things using his Bookhands \
fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn21271"

RPM_NAME = "texlive-b1encoding-2023.209.1.0svn21271-54.1.noarch.rpm"
RPM_HASH = "20a99525ad73f800eb69838cbd3daa3430488411ba2c1679901aa4a472775826d0646d679de248747688a221f8a23da0758179d497251812c4180bfb80fa9db0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-TeXB1.enc \
tex-b1cmr.fd \
tex-b1enc.def \
texlive-b1encoding"

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
