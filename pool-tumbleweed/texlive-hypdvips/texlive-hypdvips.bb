SUMMARY = "Hyperref extensions for use with dvips"
DESCRIPTION = "The hypdvips package fixes some problems when using hyperref \
with dvips. It also adds support for breaking links, file \
attachments, embedded documents and different types of \
GoTo-links. The cooperation of hyperref with cleveref is \
improved, which in addition allows an enhanced back-referencing \
system."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.03svn53197"

RPM_NAME = "texlive-hypdvips-2023.201.3.03svn53197-52.1.noarch.rpm"
RPM_HASH = "1124a98ef901f5fc886bcf362408bba223970f4a584cd5be376facdadf8aa2c9aafa3f11cffcd38e0afac762aea411eb1d31d5eba6a8aeb3d175c8c98e8b6a40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hypdvips.sty \
texlive-hypdvips"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atveryend.sty \
tex-bookmark.sty \
tex-hypcap.sty \
tex-hyperref.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
