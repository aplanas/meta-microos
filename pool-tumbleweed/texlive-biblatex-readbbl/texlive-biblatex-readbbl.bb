SUMMARY = "Read a .bbl file created by biber"
DESCRIPTION = "This small package modifies the biblatex macro which reads a \
.bbl file created by Biber. It is thus possible to include a \
.bbl file into the main document with the filecontents \
environment and send it to a publisher who does not need to run \
the Biber program. However, when the bibliography changes one \
has to create a new .bbl file."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn61549"

RPM_NAME = "texlive-biblatex-readbbl-2023.209.0.0.01svn61549-54.1.noarch.rpm"
RPM_HASH = "50e8c939661368791ec3c2c57308e664c9e16a1e90f08afa7a4c466c8320329aeb4b0021d57032d66874b543dd95d6f417a0200aec39b923dfca033de0b2898b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-readbbl.sty \
texlive-biblatex-readbbl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
