SUMMARY = "Noto Vai Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Vai Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-vai-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "00e6f60132d1be8da00d774879fef4cfea20d9f20893d9a01020a910862aa7099c1173feef500249af20a634d6aa91a7b8d7961944117c6e5ab0513cf2e286a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-vai \
noto-sans-vai-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
