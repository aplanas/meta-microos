SUMMARY = "Emulate look of a document typed on a typewriter"
DESCRIPTION = "This package is designed for those who have to submit \
dissertations, etc., to institutions that still maintain the \
typewriter is the summit of non-professional printing."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.7svn36110"

RPM_NAME = "texlive-manuscript-2023.208.1.7svn36110-53.1.noarch.rpm"
RPM_HASH = "689aedf606084ea819aa65f16de75b88d4928edb12a348ef6ff79af5d454d2af475d0db78f9e6e5ea421063bffdc3318cd37b6e19f551d55b5635d937ce4f4f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-manuscript.sty \
texlive-manuscript"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-fullpage.sty \
tex-ragged2e.sty \
tex-setspace.sty \
tex-soul.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
