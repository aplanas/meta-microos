SUMMARY = "Standard conforming typesetting of Japanese, for XeLaTeX"
DESCRIPTION = "The zxjatype package"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn53500"

RPM_NAME = "texlive-zxjatype-2023.201.0.0.7svn53500-52.1.noarch.rpm"
RPM_HASH = "da85c71555d3bf511d3f8aae3328879533ad820c1490130788508c3460dcf1747df54c24fe6e0a2670ecf4d7d9d2e3448545e913844bd6e81c7e2c02c7d529ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zxjatype.sty \
texlive-zxjatype"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-ifxetex.sty \
tex-xeCJK.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
