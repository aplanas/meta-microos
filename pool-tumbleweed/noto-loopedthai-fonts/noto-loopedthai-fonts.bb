SUMMARY = "Noto Looped Thai Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
LoopedThai font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-loopedthai-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "cb869f1d827cbdf3c214f5ac1004a01ac0b024947f84c2c44c20a610afaba5f762428908be2bd35d0254dc17c48e84a3643ca99580a99724b4eea9c74a8eecea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-loopedthai \
noto-loopedthai-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
