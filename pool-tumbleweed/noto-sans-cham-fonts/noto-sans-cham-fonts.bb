SUMMARY = "Noto Cham Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Cham Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-cham-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "ca21d3e59e0fc69b52210c43c83fc741186aac53d0e42fd000be1990928895c146e91957675d43aa22356b0ed1b0305bbba75a22c135c20d0d1275696a7fa0b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-cham \
noto-sans-cham-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
