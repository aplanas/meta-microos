SUMMARY = "Using Cyrillic languages in XeTeX"
DESCRIPTION = "Helper tools for using Cyrillic languages with XeLaTeX and \
babel."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn54308"

RPM_NAME = "texlive-xecyr-2023.201.1.2svn54308-52.1.noarch.rpm"
RPM_HASH = "b7294a194873c2908b48c917dd7b88344125b6d4a36d856cc057a0f481fcf22bbf106ccb34d2c607f091b5b514ba54f48a3797eee0398a51abf915ea02bbe5fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xecyr.sty \
texlive-xecyr"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-luatextra.sty \
tex-misccorr.sty \
tex-xltxtra.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
