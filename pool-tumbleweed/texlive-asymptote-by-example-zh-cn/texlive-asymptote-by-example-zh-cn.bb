SUMMARY = "Asymptote by example"
DESCRIPTION = "This is a tutorial written in Simplified Chinese."
LICENSE = "LGPL-3.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-asymptote-by-example-zh-cn-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "84510f25cc146956e183e15af050748b316b44efa02f5f3773bc414cfb03c87f0db4f573edb07345d47a41d1e393cff7b18ee5826ed46ada9bbc0af4c611bee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asymptote-by-example-zh-cn"

RDEPENDS:${PN} += "/bin/sh \
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
