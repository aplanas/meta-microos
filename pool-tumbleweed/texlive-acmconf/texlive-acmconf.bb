SUMMARY = "Class for ACM conference proceedings"
DESCRIPTION = "This class may be used to typeset articles to be published in \
the proceedings of ACM (Association for Computing Machinery) \
conferences and workshops. The layout produced by the acmconf \
class is based on the ACM's own specification."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn15878"

RPM_NAME = "texlive-acmconf-2023.201.1.3svn15878-54.1.noarch.rpm"
RPM_HASH = "0777d52cd4a4aacc1b52cf1bc6d6ec85aeadd7d6d48d647b9a68ea5cdb35242f6338a09b68861d8a9402460d0cf006d076dfe8a4b96bd63c8b9abdaaf92ee7fe"
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
