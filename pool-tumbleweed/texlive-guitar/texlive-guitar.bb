SUMMARY = "Guitar chords and song texts"
DESCRIPTION = "(La)TeX macros for typesetting guitar chords over song texts. \
The toolbox package is required. Note that this package only \
places arbitrary TeX code over the lyrics. To typeset the \
chords graphically (and not only by name), the author \
recommends use of an additional package such as gchords by K. \
Peeters."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn32258"

RPM_NAME = "texlive-guitar-2023.209.1.6svn32258-54.1.noarch.rpm"
RPM_HASH = "828087260784ea35ee1c5afc23eb227e8c014bcd08ecbf3cf3c7a67b19a9247679a03268ca89ef7311f8895d4da9af838f447a85fecfcfcf4f9d1629c8e59f76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-guitar.sty \
texlive-guitar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-toolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
