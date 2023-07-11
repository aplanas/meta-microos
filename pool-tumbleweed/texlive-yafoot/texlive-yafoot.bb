SUMMARY = "A bundle of miscellaneous footnote packages"
DESCRIPTION = "Contains three packages: - pfnote to number footnotes per page; \
- fnpos to control the position of footnotes; and - dblfnote to \
make footnotes double-columned."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn48568"

RPM_NAME = "texlive-yafoot-2023.201.1.1svn48568-52.2.noarch.rpm"
RPM_HASH = "4d4cbf1e83249df4110df101dfe73a34afaea005aa87ded129471adc969275eb1990c3f33909ab82656e4bd4dd3c5ba9457887d05201205ed9c84a33399e8276"
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
