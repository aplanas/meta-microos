SUMMARY = "Asymptote FAQ (Chinese translation)"
DESCRIPTION = "This is a Chinese translation of the Asymptote FAQ"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-asymptote-faq-zh-cn-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "4d8874f6f9e92eb711f6888d19d79f0236c1bd336403773e29b9b3e90156901caedb0a0a8c59430244ac50aec42100c7777d949532108575c7a8ee135b9a59c5"
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
