SUMMARY = "Easing functions for pgfmath"
DESCRIPTION = "This library implements a collection of easing functions and \
adds them to the PGF mathematical engine."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn59975"

RPM_NAME = "texlive-easing-2023.209.0.0.1svn59975-54.1.noarch.rpm"
RPM_HASH = "c88e1a28e7273a72ba5ce4456a1479d163465224c3f3d6bd52b4c5a8141f5790a820e893e05ccd938b3fb2a5c72fc23e7cf08ea58e94f37fb12473c8b0be2111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgflibraryeasing.code.tex \
texlive-easing"

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
