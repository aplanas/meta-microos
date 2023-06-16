SUMMARY = "Page numbering by chapter"
DESCRIPTION = "The package provides for 'chapterno-pageno' or \
'chaptername-pageno' page numbering. Provision is made for \
front- and backmatter in book class."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1bsvn15878"

RPM_NAME = "texlive-chappg-2023.201.2.1bsvn15878-52.1.noarch.rpm"
RPM_HASH = "8b2b5c8e88eda1361c826ab885bb00d6701d6896467c032df74295e785cc83046dceda066557413f9013bea66f5320ae6af5ae2e2d812617f2f99d61b5a144d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chappg.sty \
texlive-chappg"

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
