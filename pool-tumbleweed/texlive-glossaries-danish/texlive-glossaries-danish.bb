SUMMARY = "Danish language module for glossaries package"
DESCRIPTION = "Danish language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-danish-2023.209.1.0svn35665-54.1.noarch.rpm"
RPM_HASH = "fbfc2f60fcb6f7ac312030c53f6706fe7cac17ff4fd1169cb9177c393e11ff093b7931ce3b81daa589c9ad180a0216ac81a483974fcc5fbbe65cce52b5757e73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-danish.ldf \
texlive-glossaries-danish"

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
