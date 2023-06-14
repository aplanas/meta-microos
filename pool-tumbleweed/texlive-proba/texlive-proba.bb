SUMMARY = "Shortcuts commands to symbols used in probability texts"
DESCRIPTION = "This package includes some of the most often used commands in \
probability texts, e.g. probability, expectation, variance, \
etc. It also includes some short commands for set (blackboard) \
or filtrations (calligraphic). It requires LaTeX2e and the \
amsfonts package."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-proba-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "0092df84fad8cfc71d2835dd9fe0dac46a1ab231cf7b05169c1457b82a19c672e8f5bcd53a5b6dc659d1c670acf84bb49adf4ed3c19d4edc3af4b19186be2030"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-proba.sty \
texlive-proba"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
