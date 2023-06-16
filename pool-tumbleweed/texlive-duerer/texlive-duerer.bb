SUMMARY = "Computer Duerer fonts"
DESCRIPTION = "These fonts are designed for titling use, and consist of \
capital roman letters only. Together with the normal set of \
base shapes, the family also offers an informal shape. The \
distribution is as Metafont source. LaTeX support is available \
in the duerer-latex bundle."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn20741"

RPM_NAME = "texlive-duerer-2023.201.svn20741-52.1.noarch.rpm"
RPM_HASH = "c73affdeab1b049a1d9d8ee22fe8379e0eea021cffc0f344198d595ae4468cabba9954aa0d1e1ad1bc82ba0f1eca70a6f4707d68d6b864436f7c8983a963761a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cdb10.tfm \
tex-cdi10.tfm \
tex-cdr10.tfm \
tex-cdsl10.tfm \
tex-cdss10.tfm \
tex-cdtt10.tfm \
texlive-duerer"

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
