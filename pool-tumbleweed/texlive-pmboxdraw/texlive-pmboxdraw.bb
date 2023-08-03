SUMMARY = "Poor man's box drawing characters"
DESCRIPTION = "This package declares box drawing characters of old code pages, \
e.g. cp437. It uses rules instead of using a font."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn53046"

RPM_NAME = "texlive-pmboxdraw-2023.209.1.4svn53046-53.1.noarch.rpm"
RPM_HASH = "ac202a811aa1615f5c1a766234b6a3cafbad5b75cd52173a4e44d2dd6ca9f1bd84b85c33a557b42db3b5da3e2eeabe44ffee7ad1bcc26e40a8f00e0f3ee3fc9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pmboxdraw.sty \
texlive-pmboxdraw"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
