SUMMARY = "Christmas silliness (English)"
DESCRIPTION = "This is the plain TeX file xii.tex. Call 'pdftex xii.tex' to \
produce a (perhaps) surprising typeset document."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45804"

RPM_NAME = "texlive-xii-2023.209.svn45804-53.1.noarch.rpm"
RPM_HASH = "37afe1de8a1eb0ac678a5766fe2543ba5bb34f3ae9f4cca195105e4316a61d500043393db0fdff3293cc5b78acceec4ff06b4afbf8a21a1aa714b1bf2a1dc34d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xii"

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
