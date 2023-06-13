SUMMARY = "Severed fonts for texlive-bguq"
DESCRIPTION = "The  separated fonts package for texlive-bguq"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn27401"

RPM_NAME = "texlive-bguq-fonts-2023.201.0.0.4svn27401-53.1.noarch.rpm"
RPM_HASH = "6a93a4222f3c64c104b4cce8db87c6d115b7c1c986d0563599882b3b7f78c158f9d05c1fff1ab6ca530a796f5b86bedf86de5edb90e6a464c7a82aa0a93b8076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(bguq10t04) \
font(bguq10t05) \
font(bguq10t06) \
font(bguq10t07) \
font(bguq10t08) \
font(bguq10t09) \
font(bguq10t10) \
font(bguq10t11) \
font(bguq10t12) \
texlive-bguq-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
