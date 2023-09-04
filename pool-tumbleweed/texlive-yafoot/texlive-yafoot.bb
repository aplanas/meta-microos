SUMMARY = "A bundle of miscellaneous footnote packages"
DESCRIPTION = "Contains three packages: - pfnote to number footnotes per page; \
- fnpos to control the position of footnotes; and - dblfnote to \
make footnotes double-columned."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn48568"

RPM_NAME = "texlive-yafoot-2023.209.1.1svn48568-53.2.noarch.rpm"
RPM_HASH = "ace77e0f34f9491df34eda3c9229211b20280e1159aa81ffc82a7bc92a0f1a46074e8a287812f8d5a9be164136e9329e57f9cb3069a8fa3e5ad4a60180e2f2c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dblfnote.sty \
tex-fnpos.sty \
tex-pfnote.sty \
texlive-yafoot"

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
