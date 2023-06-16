SUMMARY = "Japanese pTeX manual"
DESCRIPTION = "This package contains the Japanese pTeX manual. Feedback is \
welcome!"
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn66182"

RPM_NAME = "texlive-ptex-manual-2023.201.svn66182-53.1.noarch.rpm"
RPM_HASH = "eadda3d72f5ab7114bc80bf9ef7baa5d39fbb274a825bf96ec28f07b239de3ea4be6818c8317ae8e5da3828e4afd326b1019b45d30a0c347c00b2769246dbca0"
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
