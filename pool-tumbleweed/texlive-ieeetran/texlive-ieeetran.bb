SUMMARY = "Document class for IEEE Transactions journals and conferences"
DESCRIPTION = "The class and its BibTeX style enable authors to produce \
officially-correct output for the Institute of Electrical and \
Electronics Engineers (IEEE) transactions, journals and \
conferences."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8bsvn59672"

RPM_NAME = "texlive-ieeetran-2023.201.1.8bsvn59672-52.1.noarch.rpm"
RPM_HASH = "eb3d4c6462e6c47f936332e3c7be5df4ea999a44da66bb0041dcc62763dd23aadfbb7d3f66dc273ce49de35f1a73cdc81d925645312ffbc578e32dcdbd31506b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(IEEEtran.cls) \
tex(IEEEtrantools.sty) \
texlive-ieeetran"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(newtxmath.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
