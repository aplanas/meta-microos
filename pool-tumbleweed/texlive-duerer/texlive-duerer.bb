SUMMARY = "Computer Duerer fonts"
DESCRIPTION = "These fonts are designed for titling use, and consist of \
capital roman letters only. Together with the normal set of \
base shapes, the family also offers an informal shape. The \
distribution is as Metafont source. LaTeX support is available \
in the duerer-latex bundle."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn20741"

RPM_NAME = "texlive-duerer-2023.209.svn20741-53.1.noarch.rpm"
RPM_HASH = "57df4595a183f74dbdb2007031bf65900496eaf74145d15dfeae07a885abaa962187846ba4fb02611bbd36515896cd8f016189054f4debb1e4347ca6c738a5f0"
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
