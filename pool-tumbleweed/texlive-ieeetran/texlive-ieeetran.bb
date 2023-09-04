SUMMARY = "Document class for IEEE Transactions journals and conferences"
DESCRIPTION = "The class and its BibTeX style enable authors to produce \
officially-correct output for the Institute of Electrical and \
Electronics Engineers (IEEE) transactions, journals and \
conferences."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8bsvn59672"

RPM_NAME = "texlive-ieeetran-2023.209.1.8bsvn59672-54.1.noarch.rpm"
RPM_HASH = "a6343136e520f6c3c435189a857d0e16a1ace585edea3ceb2e3da535078f8d5f4c082c869c64723fae369c45ba6bdadddf0b4019c543c338b29c6f7ad2772e71"
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
