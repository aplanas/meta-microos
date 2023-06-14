SUMMARY = "Printing addresses on envelopes"
DESCRIPTION = "A simple package, that prints both 'from' and 'to' addresses."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-envbig-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "1ce2185e1f92e92a61f74b3acb851f0f55293d59649791c89e0d663b05a7f354ac3267cef1560d61b4ce7181984bc6a487df055661dd19b439ca59a24132223d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-envbig.sty \
texlive-envbig"

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
