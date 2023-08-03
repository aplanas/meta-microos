SUMMARY = "A summary list of PicTeX documentation"
DESCRIPTION = "A summary of available resources providing (or merely \
discussing) documentation of PicTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn24927"

RPM_NAME = "texlive-doc-pictex-2023.209.svn24927-53.1.noarch.rpm"
RPM_HASH = "88b5dcd3f1b40b7d38829fbb62bafe6eede868d235b38fd48fc95bc60df0ea3642d4162b4fccb1ba216fb8ceb5605f548cc48a35cd2f2b206fc038b89ff2e9ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doc-pictex"

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
