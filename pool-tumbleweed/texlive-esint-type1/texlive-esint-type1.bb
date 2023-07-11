SUMMARY = "Font esint10 in Type 1 format"
DESCRIPTION = "This is Eddie Saudrais's font esint10 in Adobe Type 1 format. \
The Adobe Type 1 implementation was generated from the original \
Metafont using mftrace. This distribution does not contain the \
TFM files that are necessary to use the fonts with TeX; the TFM \
files can be generated from the Metafont sources obtained by \
following the instructions in the normal way."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-esint-type1-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "8badf924379627685c02b51517ba3455fbc71c81e475efb94011da3db782b7e4ba7c2ef3b8e8b4ae1497bfa92b2e6e1d81dc250146f29e7a4fa9a494eef6fde4"
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
