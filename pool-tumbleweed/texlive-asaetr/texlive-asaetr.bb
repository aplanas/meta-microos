SUMMARY = "Transactions of the ASAE"
DESCRIPTION = "A class and BibTeX style for submissions to the Transactions of \
the American Society of Agricultural Engineers. Also included \
is the Metafont source of a slanted Computer Modern Caps and \
Small Caps font."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0asvn15878"

RPM_NAME = "texlive-asaetr-2023.201.1.0asvn15878-53.1.noarch.rpm"
RPM_HASH = "e88075d031aa37df545b6c112fd594c626aa9984421f0ff20cf999a87770a7111ecc7637d1ac6e01beed361ad854f5bdac7ea94ea3007df5ef14302fa5593dd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(asaesub.sty) \
tex(asaetr.cls) \
tex(asaetr.sty) \
texlive-asaetr"
RDEPENDS:${PN} += "/bin/sh \
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
