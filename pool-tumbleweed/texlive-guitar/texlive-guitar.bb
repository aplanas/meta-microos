SUMMARY = "Guitar chords and song texts"
DESCRIPTION = "(La)TeX macros for typesetting guitar chords over song texts. \
The toolbox package is required. Note that this package only \
places arbitrary TeX code over the lyrics. To typeset the \
chords graphically (and not only by name), the author \
recommends use of an additional package such as gchords by K. \
Peeters."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn32258"

RPM_NAME = "texlive-guitar-2023.201.1.6svn32258-53.2.noarch.rpm"
RPM_HASH = "a34cf4de51584200e13aa62659128301a1b9a9b5d693ac163bf9518414d15faaedbac94f4ec5ec3c64c69d4aed78fa0208043f56b5890c9fe43e924d07fb7319"
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
