SUMMARY = "Guitar chords and song texts"
DESCRIPTION = "(La)TeX macros for typesetting guitar chords over song texts. \
The toolbox package is required. Note that this package only \
places arbitrary TeX code over the lyrics. To typeset the \
chords graphically (and not only by name), the author \
recommends use of an additional package such as gchords by K. \
Peeters."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn32258"

RPM_NAME = "texlive-guitar-2023.209.1.6svn32258-54.2.noarch.rpm"
RPM_HASH = "250de48cfa0fae50a18d1e8e239e5d024820dab4de3e5909649149efd61e6d656bfcb67ed7d794c959e33d68b676d65b6aec24eeb55d22e5a47423e474c643ca"
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
