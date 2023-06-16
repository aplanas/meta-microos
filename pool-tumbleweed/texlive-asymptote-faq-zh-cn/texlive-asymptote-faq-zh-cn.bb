SUMMARY = "Asymptote FAQ (Chinese translation)"
DESCRIPTION = "This is a Chinese translation of the Asymptote FAQ"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-asymptote-faq-zh-cn-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "386955b1ec638ac8f7e077c98bf7e93ffd09714fd6b1246fb44eac65842f893534aa51a7e42fc50730b7e39a2ee2a9fc34e39e666ad43a5c7197460da503e979"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asymptote-faq-zh-cn"

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
