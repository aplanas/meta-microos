SUMMARY = "Hyperref extensions for use with dvips"
DESCRIPTION = "The hypdvips package fixes some problems when using hyperref \
with dvips. It also adds support for breaking links, file \
attachments, embedded documents and different types of \
GoTo-links. The cooperation of hyperref with cleveref is \
improved, which in addition allows an enhanced back-referencing \
system."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.03svn53197"

RPM_NAME = "texlive-hypdvips-2023.209.3.03svn53197-54.1.noarch.rpm"
RPM_HASH = "0326a9026c9b4d1dd802b9fe4f5df2ca0bd5a8011a1977cf24a5d5be1881a2fece11e5956e7ad346bfefd43e3899ea1159e8aa2048cef0d47cf04894494c1ddd"
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
