SUMMARY = "Using Cyrillic languages in XeTeX"
DESCRIPTION = "Helper tools for using Cyrillic languages with XeLaTeX and \
babel."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn54308"

RPM_NAME = "texlive-xecyr-2023.201.1.2svn54308-52.2.noarch.rpm"
RPM_HASH = "18c4ee7e34e1d4d0d428687fa1cb9a158ca6d67712f6f922d2bad79ffe672bf90bf6bd40b52938b7fa86e54d17096c821e8b9d545e05e88a190765fe38c83dce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xecyr.sty \
texlive-xecyr"

RDEPENDS:${PN} += "/usr/bin/sh \
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
