SUMMARY = "Diagrams of board positions in the games of Havannah and Hex"
DESCRIPTION = "This package defines macros for typesetting diagrams of board \
positions in the games of Havannah and Hex."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn36348"

RPM_NAME = "texlive-havannah-2023.209.svn36348-54.2.noarch.rpm"
RPM_HASH = "74667c0d9d2ba0d6b77560bdf857746f9bc682e0c408c347b45205656ccd6517befa4a1d9328ddff333f82ac894a424676ed20d1af9ebdeee043b89a66763dce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-havannah.sty \
texlive-havannah"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
