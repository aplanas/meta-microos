SUMMARY = "Systematic treatment of 'foreign' words in documents"
DESCRIPTION = "The package supports authors' use of consistent typesetting of \
foreign words in documents."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn27819"

RPM_NAME = "texlive-foreign-2023.209.2.7svn27819-53.1.noarch.rpm"
RPM_HASH = "4bb7a8c588538fce17bd763895a304e5c455892ea6b238768c1f5327b47b36208e8755dd66bc9b1f6538d8c285c7862fcb047c89de815b1f27cb3e155040403a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-foreign.sty \
texlive-foreign"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xpunctuate.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
