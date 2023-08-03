SUMMARY = "Font esint10 in Type 1 format"
DESCRIPTION = "This is Eddie Saudrais's font esint10 in Adobe Type 1 format. \
The Adobe Type 1 implementation was generated from the original \
Metafont using mftrace. This distribution does not contain the \
TFM files that are necessary to use the fonts with TeX; the TFM \
files can be generated from the Metafont sources obtained by \
following the instructions in the normal way."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-esint-type1-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "eb907f22b1c5df4e2aeb3d8b52d2fcd3e0cec179c7fdc7e342812797cc55b0c595b2413a025a3ecf61b2ea4a8c9dc34c36cde5cd1f548af019dc47c6dded1ac2"
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
