SUMMARY = "Generalisations of the page advance commands"
DESCRIPTION = "Provides \\clearpage and \\newpage variants that guarantee to end \
up on even/odd numbered pages; these 4 commands all have an \
optional argument whose content will be placed on any 'empty' \
page generated."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn15878"

RPM_NAME = "texlive-nextpage-2023.209.1.1asvn15878-55.1.noarch.rpm"
RPM_HASH = "7b2ed00c5acfe5028e65ab81fc03f7aeb4d588bc6e736877fc2ca7ae20df1c4c83932017678ec187612a1e0384cace9fa7767b1616181f922ed075073128ff6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nextpage.sty \
texlive-nextpage"

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
