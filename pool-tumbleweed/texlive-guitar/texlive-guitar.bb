SUMMARY = "Guitar chords and song texts"
DESCRIPTION = "(La)TeX macros for typesetting guitar chords over song texts. \
The toolbox package is required. Note that this package only \
places arbitrary TeX code over the lyrics. To typeset the \
chords graphically (and not only by name), the author \
recommends use of an additional package such as gchords by K. \
Peeters."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn32258"

RPM_NAME = "texlive-guitar-2023.201.1.6svn32258-53.1.noarch.rpm"
RPM_HASH = "3180d5aed7f2d92c114b9caf6224a83d05e1bbf76c6aa4f5bd992e0b5872063e49eb5d1ee4a1b6e0095db053da7d3de1899a5ea7468b759d5a608a021adf64aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-guitar.sty \
texlive-guitar"

RDEPENDS:${PN} += "/bin/sh \
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
