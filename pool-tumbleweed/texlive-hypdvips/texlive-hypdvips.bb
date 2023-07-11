SUMMARY = "Hyperref extensions for use with dvips"
DESCRIPTION = "The hypdvips package fixes some problems when using hyperref \
with dvips. It also adds support for breaking links, file \
attachments, embedded documents and different types of \
GoTo-links. The cooperation of hyperref with cleveref is \
improved, which in addition allows an enhanced back-referencing \
system."
LICENSE = "LPPL-1.0"

PV = "2023.208.3.03svn53197"

RPM_NAME = "texlive-hypdvips-2023.208.3.03svn53197-53.1.noarch.rpm"
RPM_HASH = "0e658036bcd73ff99eb5179d324d6ae28ffcc0277b864e54f9b8d54c79c92e2e7885ae86ffa49f03e62daac1c60f94665ab37d0879faa4ea6cc21565498690ea"
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
