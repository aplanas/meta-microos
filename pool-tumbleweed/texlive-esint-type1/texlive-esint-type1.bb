SUMMARY = "Font esint10 in Type 1 format"
DESCRIPTION = "This is Eddie Saudrais's font esint10 in Adobe Type 1 format. \
The Adobe Type 1 implementation was generated from the original \
Metafont using mftrace. This distribution does not contain the \
TFM files that are necessary to use the fonts with TeX; the TFM \
files can be generated from the Metafont sources obtained by \
following the instructions in the normal way."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-esint-type1-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "4595efc9648189723c3cd6aabe77951bcdaf30d2ba6d06bdb109cad234dcd91da81c7121b171bcb74aeece0d311c61e4cc237f0634ba63c44f67b34352ec483f"
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
