SUMMARY = "Noto Sans Traditional Chinese Font - Medium"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Medium weight of \
Sans font for Traditional Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-tc-medium-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "c31ad51c73a1b8ad8f9fdbf4ac1f2bab1183d7e7d5fa9b04c7a7d377592f629d4516201e2a74164d60afc1dafbe040cf3f92b19e48314fa588e0eef77f2c497a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-tc-medium-fonts \
noto-sans-tc-medium-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
