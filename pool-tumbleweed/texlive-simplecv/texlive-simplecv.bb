SUMMARY = "A simple class for writing curricula vitae"
DESCRIPTION = "A derivative of the cv class available to lyx users (renamed to \
avoid the existing cv package)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6asvn35537"

RPM_NAME = "texlive-simplecv-2023.201.1.6asvn35537-53.1.noarch.rpm"
RPM_HASH = "42109f7019dd173d94d0a0daf9c75085b6ce532a70da361d51c5dd544bffddea995905822b01e6d5ce6e2db0f7d37b3e8215aac78d933947f5cc3b5cb7abfd79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simplecv.cls \
texlive-simplecv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
