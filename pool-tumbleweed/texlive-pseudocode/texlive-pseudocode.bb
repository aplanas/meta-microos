SUMMARY = "LaTeX environment for specifying algorithms in a natural way"
DESCRIPTION = "This package provides the environment 'pseudocode' for \
describing algorithms in a natural manner."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54080"

RPM_NAME = "texlive-pseudocode-2023.201.svn54080-52.1.noarch.rpm"
RPM_HASH = "abd9eb9e570b861d9fd6c536b3915bb4e32c8010b88066127bfefe18b68c36666e68e4e28ddb03afc7066cb08de83422762c26d157877508387f33e430af4a42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pseudocode.sty \
texlive-pseudocode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancybox.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
