SUMMARY = "Print two pages on a single page"
DESCRIPTION = "The package is for printing two pages on a single (landscape) \
A4 page. Page numbers appear on the included pages, and not on \
the landscape 'container' page."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn17024"

RPM_NAME = "texlive-twoinone-2023.201.svn17024-52.1.noarch.rpm"
RPM_HASH = "03ba21211c83385661592ea908712f6e1bb8d2edcd3e565c333176e58689d11e01e9e7d39158c61e4365fac1f9e0e8001f6ebf346f477038394275e518fd3f2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(2in1.sty) \
texlive-twoinone"

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
