SUMMARY = "A Chinese translation of the asymptote manual"
DESCRIPTION = "This is an (incomplete, simplified) Chinese translation of the \
Asymptote manual."
LICENSE = "LGPL-3.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-asymptote-manual-zh-cn-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "7039da2ef1ef0e8aff0f180ffa3981be661b0955485c831cb5fd48fbd54c944a0a4417f809369bf71d6bd7197ef38b3226919e1f84b5d2f79f1c549cd4fcc840"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asymptote-manual-zh-cn"

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
