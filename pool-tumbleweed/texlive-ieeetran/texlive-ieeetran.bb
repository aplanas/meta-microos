SUMMARY = "Document class for IEEE Transactions journals and conferences"
DESCRIPTION = "The class and its BibTeX style enable authors to produce \
officially-correct output for the Institute of Electrical and \
Electronics Engineers (IEEE) transactions, journals and \
conferences."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.8bsvn59672"

RPM_NAME = "texlive-ieeetran-2023.208.1.8bsvn59672-53.1.noarch.rpm"
RPM_HASH = "5e761868accb394302b35ac2a71a9081544ac662ebb39d2b2184e4a6b5159acffb7fcbd925c69f7ac2fa6475f392494b406d3195e5ce45f4960437405c9ad31f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-IEEEtran.cls \
tex-IEEEtrantools.sty \
texlive-ieeetran"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-newtxmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
