SUMMARY = "Support multiple lines pseudocode"
DESCRIPTION = "This package extends the package algorithmicx to support long \
text which spans over multiple lines."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.91svn56006"

RPM_NAME = "texlive-algxpar-2023.209.0.0.91svn56006-55.1.noarch.rpm"
RPM_HASH = "1a0386151b6fa0de76acf9ac5c0b31c772bcf92b7ee96e08c88275e57442010a00d9072d60e72921d4bd991c35bb02ffc1216e67fecc021c9378d0215033b7ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-algxpar.sty \
texlive-algxpar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithmicx.sty \
tex-algpseudocode.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-fancyvrb.sty \
tex-listings.sty \
tex-ragged2e.sty \
tex-tcolorbox.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
