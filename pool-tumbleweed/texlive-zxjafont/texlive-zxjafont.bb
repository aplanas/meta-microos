SUMMARY = "Set up Japanese font families for XeLaTeX"
DESCRIPTION = "The zxjafont package"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn62864"

RPM_NAME = "texlive-zxjafont-2023.209.1.3svn62864-53.2.noarch.rpm"
RPM_HASH = "65518794973dad9565ed8af2a985f06de0357aee100afc4ffb2d1a38ab0e56baeb7f5793bd62e6a325a34c994a330c6774c9b4af57f1b0ed60e461086a1ea40c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zxjafont.sty \
texlive-zxjafont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fontspec.sty \
tex-ifxetex.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
