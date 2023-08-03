SUMMARY = "Class for ACM conference proceedings"
DESCRIPTION = "This class may be used to typeset articles to be published in \
the proceedings of ACM (Association for Computing Machinery) \
conferences and workshops. The layout produced by the acmconf \
class is based on the ACM's own specification."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn15878"

RPM_NAME = "texlive-acmconf-2023.209.1.3svn15878-55.1.noarch.rpm"
RPM_HASH = "988f07f182970805444f81223bdd3cbbc39e3cf90bf76288ddd396ee3ee2beb26208bbe398060f6800f4c25a0934064020f6cfba08f763bdba8541c4a6104c6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-acmconf.cls \
texlive-acmconf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-flushend.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
