SUMMARY = "Add colour to LaTeX tables"
DESCRIPTION = "The package allows rows and columns to be coloured, and even \
individual cells."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0fsvn64015"

RPM_NAME = "texlive-colortbl-2023.209.1.0fsvn64015-54.1.noarch.rpm"
RPM_HASH = "edb44e45fee4e762de905d145bb01eb2b52998ec264ff501dc5d6372661e3f2eb17c2a4a17025e8393e711c74963332326713625ce4a37ce6295a8b5bf3d9939"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colortbl.sty \
texlive-colortbl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
