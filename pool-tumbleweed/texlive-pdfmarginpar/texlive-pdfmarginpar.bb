SUMMARY = "Generate marginpar-equivalent PDF annotations"
DESCRIPTION = "The package provides the \\pdfmarginpar command which is similar \
in spirit to \\marginpar. However, it creates PDF annotations \
which may be viewed with Adobe Reader in place of marginal \
texts. Small icons indicate the in-text position where the \
message originates, popups provide the messages themselves. \
Thus bugfixes and other such communications are clearly visible \
together when viewing the document, while the document itself \
is not obscured."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.92svn23492"

RPM_NAME = "texlive-pdfmarginpar-2023.201.0.0.92svn23492-51.1.noarch.rpm"
RPM_HASH = "8bb020d7edbffb8ae1ca4096c93bd9de89d82d1d4c1c90a94260fcafca9afd0f24fedd6a717e5c1668a48aea3a97e0654e996a20928ef869eabba04382abcf34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pdfmarginpar.sty) \
texlive-pdfmarginpar"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pgfkeys.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
