SUMMARY = "Typeset units"
DESCRIPTION = "The package is provided as a bundle with the nicefrac package \
for typing fractions. Units uses nicefrac in typesetting \
physical units in a standard-looking sort of way."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.9bsvn42428"

RPM_NAME = "texlive-units-2023.201.0.0.9bsvn42428-53.1.noarch.rpm"
RPM_HASH = "0b44830adda9a72975421a16fd1ae6a00080e6cbdc93fc9b4f50165beb818c1b7e73480d38a2a2ae30d06aaefb9c8965cc930e4487a2e328c021fc72e3b8c82d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nicefrac.sty \
tex-units.sty \
texlive-units"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
