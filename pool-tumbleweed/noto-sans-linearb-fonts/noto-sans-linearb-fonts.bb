SUMMARY = "Noto Linear B Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
LinearB Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-linearb-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "4741bb2cd0af9542704ee66385c5fae167c1c3c9419984d58667a100f7e4e03a2fa8cbc270cf228d4d3d3bf7753eaa0f4f768e59806942258a46baf8444e26d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-linearb \
noto-sans-linearb-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
