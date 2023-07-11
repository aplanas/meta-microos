SUMMARY = "Easing functions for pgfmath"
DESCRIPTION = "This library implements a collection of easing functions and \
adds them to the PGF mathematical engine."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn59975"

RPM_NAME = "texlive-easing-2023.201.0.0.1svn59975-53.2.noarch.rpm"
RPM_HASH = "d64440e001b92317e85e283926c1294da1dfe755689fec87c11c4316e94e070d2720125a5cbfae87c63abf23ceab3388469e68f70d4f7deaae7f4b781dcfe320"
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
