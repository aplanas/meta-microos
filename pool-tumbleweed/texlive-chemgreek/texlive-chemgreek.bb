SUMMARY = "Upright Greek letters in chemistry"
DESCRIPTION = "The package provides upright Greek letters in support of other \
chemistry packages (such as chemmacros). The package used to be \
distributed as a part of chemmacros."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn53437"

RPM_NAME = "texlive-chemgreek-2023.209.1.1asvn53437-54.1.noarch.rpm"
RPM_HASH = "c7e733cfe485d46a828e7cae8a475375275e7383fea3612149c9f34ffb612bd6523bcb1e97cfbf417c6d63700bba311a17b8d3b52fa36f979fe4d0b1570f7821"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemgreek.sty \
texlive-chemgreek"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
