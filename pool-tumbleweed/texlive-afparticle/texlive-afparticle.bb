SUMMARY = "Typesetting articles for Archives of Forensic Psychology"
DESCRIPTION = "This package provides a class for typesetting articles for the \
open access journal Archives of Forensic Psychology."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn35900"

RPM_NAME = "texlive-afparticle-2023.209.1.3svn35900-55.1.noarch.rpm"
RPM_HASH = "e1cd890d53deb843eeb1201bd58c9e21899c7b0dde32b5c82d05a9b3be0ac486ef0d5afd6725a013c286af7b621d3d05217bb4d5d1515c008293a9c0ba4d0acd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-afparticle.cls \
texlive-afparticle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-apacite.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-elsarticle.cls \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-lastpage.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
