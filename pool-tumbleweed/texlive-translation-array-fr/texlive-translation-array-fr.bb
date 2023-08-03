SUMMARY = "French translation of the documentation of array"
DESCRIPTION = "A French translation of the documentation of array."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn24344"

RPM_NAME = "texlive-translation-array-fr-2023.209.svn24344-53.1.noarch.rpm"
RPM_HASH = "2e303327a37d6e20b88fb818fb1570b40094009839a27f6ca9c984e2497e790b3ed2dac45d142b1a38cceaacbb28f5fc629a1c9f4c49be5f000b877d8bac9a2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-array-fr"

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
