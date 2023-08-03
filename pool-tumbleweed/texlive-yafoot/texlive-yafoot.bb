SUMMARY = "A bundle of miscellaneous footnote packages"
DESCRIPTION = "Contains three packages: - pfnote to number footnotes per page; \
- fnpos to control the position of footnotes; and - dblfnote to \
make footnotes double-columned."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn48568"

RPM_NAME = "texlive-yafoot-2023.209.1.1svn48568-53.1.noarch.rpm"
RPM_HASH = "ba43b74e8a9439cb046d9a46921037794b2e42a430c4ec7f63e014b36eba3d8c13446c69b6a6c9a76ef6304e12a86541c8f1d1aa5fe0251abdb9d7c082b254c8"
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
