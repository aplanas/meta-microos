SUMMARY = "Page numbering by chapter"
DESCRIPTION = "The package provides for 'chapterno-pageno' or \
'chaptername-pageno' page numbering. Provision is made for \
front- and backmatter in book class."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1bsvn15878"

RPM_NAME = "texlive-chappg-2023.209.2.1bsvn15878-53.1.noarch.rpm"
RPM_HASH = "ae57eabffdce51a295b088fe451a82e264ec5855d65ceaf344274a7ea21a73ac942e17fadf19d1f3ebf495b43d3d4bc9cf899981c1869d3312a1a7602a5c79b7"
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
