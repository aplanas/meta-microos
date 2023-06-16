SUMMARY = "LaTeX support for the TeX book symbols"
DESCRIPTION = "A LaTeX package for easy access to the symbols of the Knuth's \
'manual' font, such as the Dangerous Bend and Manual-errata \
Arrow."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54684"

RPM_NAME = "texlive-manfnt-2023.201.svn54684-52.1.noarch.rpm"
RPM_HASH = "e2ef1d137d6baf943abe4264b6decdd6445ad727cc63d6788713cdb832ebc72b520db2274507ec76e94fd0d1452365fe82467e1031e0a988bf81c42d215977f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-manfnt.sty \
texlive-manfnt"

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
