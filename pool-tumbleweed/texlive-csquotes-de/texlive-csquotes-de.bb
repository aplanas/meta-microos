SUMMARY = "German translation of csquotes documentation"
DESCRIPTION = "This is a translation of the documentation of csquotes version \
5.1."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.01svn23371"

RPM_NAME = "texlive-csquotes-de-2023.204.1.01svn23371-54.1.noarch.rpm"
RPM_HASH = "ab38254e1e0458bc2e61047682a81be18ef08d6531b52c7079a918c648c7ac33b28da3b780afd8b1724438f8ffc363cf706f34183d4ee3deecb6a315f0fcd30a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-csquotes-de"

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
