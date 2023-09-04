SUMMARY = "LaTeX support for the eiad font"
DESCRIPTION = "The package provides macros to support use of the eiad fonts in \
OT1 encoding. Also offered are a couple of Metafont files \
described in the font package, but not provided there."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-eiad-ltx-2023.209.1.0svn15878-54.2.noarch.rpm"
RPM_HASH = "c91218fa6285009fb928ae01100b466bbbcb7881717710a918aa84900aa699deb2388fb6690b329129bb8cceda37efe0660edf2f78fb814743732da8f004be7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eiad.sty \
texlive-eiad-ltx"

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
