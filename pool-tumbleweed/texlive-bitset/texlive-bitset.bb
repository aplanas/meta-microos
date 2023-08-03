SUMMARY = "Handle bit-vector datatype"
DESCRIPTION = "This package defines and implements the data type bit set, a \
vector of bits. The size of the vector may grow dynamically. \
Individual bits can be manipulated."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn53837"

RPM_NAME = "texlive-bitset-2023.209.1.3svn53837-53.1.noarch.rpm"
RPM_HASH = "476ae36a2941810bd70ef0dbd950b0b046efd1f33711c6071fdd7ac58dec954b49c00a1ab89aa322ec39264215182fdc950b6af159cd3a42f33b7209af668a4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bitset.sty \
texlive-bitset"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bigintcalc.sty \
tex-infwarerr.sty \
tex-intcalc.sty \
texlive \
texlive-bigintcalc \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
