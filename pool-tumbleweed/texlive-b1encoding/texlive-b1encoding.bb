SUMMARY = "LaTeX encoding tools for Bookhands fonts"
DESCRIPTION = "The package characterises and defines the author's B1 encoding \
for use with LaTeX when typesetting things using his Bookhands \
fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn21271"

RPM_NAME = "texlive-b1encoding-2023.201.1.0svn21271-53.1.noarch.rpm"
RPM_HASH = "f8956ef96816c4c787eb03f83a3641ff006f7cbb6f6ba0f92e35be792e57aad57e67a02d8468967743ba75978c9f70ce1d3087382fde11e4ccce76f9a6e7ea19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(TeXB1.enc) \
tex(b1cmr.fd) \
tex(b1enc.def) \
texlive-b1encoding"

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
