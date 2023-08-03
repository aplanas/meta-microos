SUMMARY = "Add emojis to citations"
DESCRIPTION = "This package adds emojis to citations."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn55131"

RPM_NAME = "texlive-emojicite-2023.209.0.0.3svn55131-54.1.noarch.rpm"
RPM_HASH = "a46cfdc9517e44427e0b0d2bf5ee5f5d54320992956e6a303949374c4d884047f65dd8dfb34299f24ea9ea7263ef66777a9eac6966867c1e5c93b7099bd0dad1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emojicite.sty \
texlive-emojicite"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-emoji.sty \
tex-natbib.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
