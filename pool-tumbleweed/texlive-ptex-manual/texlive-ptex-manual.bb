SUMMARY = "Japanese pTeX manual"
DESCRIPTION = "This package contains the Japanese pTeX manual. Feedback is \
welcome!"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn66182"

RPM_NAME = "texlive-ptex-manual-2023.209.svn66182-54.2.noarch.rpm"
RPM_HASH = "7de3747341b9863a79aa5199032a2e7b4ec5ef858a55d5523756a60e376982f192a6089def902d7ea8f3705e2bb312bd94db4721e7bbc2f8823b974bf652a7e2"
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
