SUMMARY = "Japanese pTeX manual"
DESCRIPTION = "This package contains the Japanese pTeX manual. Feedback is \
welcome!"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn66182"

RPM_NAME = "texlive-ptex-manual-2023.209.svn66182-54.1.noarch.rpm"
RPM_HASH = "ea922fedeebcc8675d8637580cec596b1983e6db965069b2cf13abe13ef9995b02e23f0dfe72307b09148d5611207645849554467de11a4a474b9f7ed647ddd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex-manual"

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
