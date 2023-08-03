SUMMARY = "TeX Live manual (Russian)"
DESCRIPTION = "The texlive-ru package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58426"

RPM_NAME = "texlive-texlive-ru-2023.209.svn58426-55.1.noarch.rpm"
RPM_HASH = "0b858cf4425bbf72a210314b9f6cc15fa3742745f8ba84a8677eccb53d93ea4dad541bb9ab51fe9538c426e600f6a1136ea3c91bde6d4016452b3b8ec8d2e258"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-ru"

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
