SUMMARY = "Font esint10 in Type 1 format"
DESCRIPTION = "This is Eddie Saudrais's font esint10 in Adobe Type 1 format. \
The Adobe Type 1 implementation was generated from the original \
Metafont using mftrace. This distribution does not contain the \
TFM files that are necessary to use the fonts with TeX; the TFM \
files can be generated from the Metafont sources obtained by \
following the instructions in the normal way."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-esint-type1-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "fb3803b1b778dcf36df6df7ae9b46b0bf915b8a5674c5ba4e12f836fac847ce626bcebd2aca1b293679e7c015681905165a9b80068a95f815078a7e79e3a6df5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-esint.map \
tex-esint.tex \
texlive-esint-type1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-esint \
texlive-esint-type1-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
