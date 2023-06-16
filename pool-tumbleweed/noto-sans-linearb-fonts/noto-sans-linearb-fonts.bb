SUMMARY = "Noto Linear B Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
LinearB Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-linearb-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "04c27bd3f5119d93f6b052274204415044b2667584dc2c0cff1c57c9c1b54aed724fc10c0c14e7ef272c7d57e06c6665ccb80d1d36b83f279070839fd2ca05c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-linearb \
noto-sans-linearb-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
