SUMMARY = "Noto Runic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Runic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-runic-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "f9aae21268b33d5ced40fcd85a75c5b632455eb9ee9f9f82a9542f213a7e579fefc3695ea16244e3b02e41d46f75b36c22e362d0a804d489ef688e419eebe654"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-runic \
noto-sans-runic-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
