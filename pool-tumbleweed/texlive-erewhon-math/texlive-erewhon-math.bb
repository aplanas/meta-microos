SUMMARY = "Utopia based OpenType Math font"
DESCRIPTION = "OpenType version of the fourier Type1 fonts designed by Michel \
Bovani."
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.56svn65684"

RPM_NAME = "texlive-erewhon-math-2023.209.0.0.56svn65684-54.2.noarch.rpm"
RPM_HASH = "6ed34094d216646c0b0982ab6c954d46519afd6f481c83d3ad03ec2734fa7b504b0b66aa4185c7aacf843041d6f1af80b63b846e787df18824f1d5d39245492c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fourier-otf.sty \
texlive-erewhon-math"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fourier-orns.sty \
tex-iftex.sty \
tex-realscripts.sty \
tex-unicode-math.sty \
tex-xkeyval.sty \
texlive \
texlive-erewhon-math-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
