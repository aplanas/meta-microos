SUMMARY = "Draw Hasse diagrams"
DESCRIPTION = "This package draws Hasse diagrams of the partially ordered sets \
of the simple roots of any complex simple Lie algebra. It uses \
the Dynkin diagrams package dynkin-diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn61719"

RPM_NAME = "texlive-lie-hasse-2023.209.1.0svn61719-55.1.noarch.rpm"
RPM_HASH = "14f1348a46054477eb0177b40de35122280933a1bb0af435f6c3f54fcfcbe420fe6b1ee168c4e9ab8874c000a8524b0dd91d7f1cc7b4145f63b29a362a422748"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lie-hasse.sty \
texlive-lie-hasse"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-dynkin-diagrams.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
