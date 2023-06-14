SUMMARY = "Noto Newa Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Newa Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-newa-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "dc3c0adfb09b9c0c5570d96f4f398847658d8c5e187447e2b0b93cda7dbdba734a0564828bc8ea4f9bb53098c356ff19f68a891278c24d2236fdf3cf82f27540"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-newa \
noto-sans-newa-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
